package com.codelab.basiclayouts.ui.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.data.SampleData
import com.codelab.basiclayouts.ui.theme.MyYogicAppTheme

@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(modifier = modifier
        .height(120.dp)
        .padding(top = 8.dp, bottom = 8.dp),
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(SampleData.favoriteCollectionsData) { item ->
            FavoriteCollectionCard(
                drawable = item.drawable,
                text = item.text,
                modifier = Modifier.height(56.dp))
        }
    }
}

@Composable
fun FavoriteCollectionCard(
    modifier: Modifier = Modifier,
    @DrawableRes drawable: Int,
    @StringRes text: Int
) {
    Surface(
        modifier = modifier.width(200.dp),
        shape = MaterialTheme.shapes.small) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(56.dp))
            Text(text = stringResource(text),
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FavoriteCollectionsGridPreview() {
    MyYogicAppTheme { FavoriteCollectionsGrid() }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FavoriteCollectionCardPreview() {
    MyYogicAppTheme {
        FavoriteCollectionCard(
            modifier = Modifier.padding(8.dp),
            text = R.string.fc2_nature_meditations,
            drawable = R.drawable.fc2_nature_meditations
        )
    }
}

