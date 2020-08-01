package pci.syams.whatsappapp.utils

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import pci.syams.whatsappapp.R

fun populateImage(
    context: Context?,
    uri: String?,
    imageView: ImageView,
    errorDrawable: Int = R.drawable.empty
) {
    if (context != null) {
        val options = RequestOptions().placeholder(progressDrawable(context)).error(errorDrawable)
        Glide.with(context).load(uri).apply(options).into(imageView)
    }
}

// menambahkan progressDrawable ketika Image dalam proses pemasangan
fun progressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth =
            5f                                                    // ketebalan garis lingkaran centerRadius = 30f // diameter lingkaran
        start()                                                             // memulai progressDrawable
    }
}
