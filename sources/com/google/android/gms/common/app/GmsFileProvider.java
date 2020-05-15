package com.google.android.gms.common.app;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsFileProvider extends C1136kk {

    /* renamed from: a */
    static final String[] f30142a = new String[0];

    /* renamed from: b */
    private boolean f30143b = false;

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (cdky.f181179a.mo6606a().mo77848a()) {
            try {
                super.attachInfo(context, providerInfo);
            } catch (IllegalArgumentException e) {
                this.f30143b = true;
            }
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        if (!this.f30143b) {
            return super.delete(uri, str, strArr);
        }
        return 0;
    }

    public final String getType(Uri uri) {
        if (!this.f30143b) {
            return super.getType(uri);
        }
        return null;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (!this.f30143b) {
            return super.openFile(uri, str);
        }
        throw new FileNotFoundException("FileProvider creation failed.");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (this.f30143b) {
            return new MatrixCursor(f30142a);
        }
        return super.query(uri, strArr, str, strArr2, str2);
    }
}
