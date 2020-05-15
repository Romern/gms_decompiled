package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;

/* renamed from: aqvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvy extends tih {

    /* renamed from: c */
    private final String f86951c;

    public aqvy(Context context, String str) {
        super(context);
        this.f86951c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            openAssetFileDescriptor = getContext().getContentResolver().openAssetFileDescriptor(Uri.parse(this.f86951c), "r");
            Bitmap decodeStream = BitmapFactory.decodeStream(openAssetFileDescriptor.createInputStream(), null, tey.m36887a());
            openAssetFileDescriptor.close();
            return decodeStream;
        } catch (IOException e) {
            return null;
        } catch (Throwable th) {
            openAssetFileDescriptor.close();
            throw th;
        }
    }
}
