package com.google.android.gms.fitness.sync;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessContentChimeraProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!cdyu.m135384b()) {
            super.dump(fileDescriptor, printWriter, strArr);
            return;
        }
        yzp a = yzp.m45078a(getContext());
        for (String str : a.mo30874b().mo30715b()) {
            if (a.mo30877c(str).mo31378f()) {
                printWriter.append((CharSequence) "Begin dump for account ").append((CharSequence) str).append((CharSequence) "\n");
                new zmr(getContext(), str, a.mo30877c(str), a.mo30880e(str), a.mo30881f(str), a.mo30894l(str), srb.f45012a).mo31261a(printWriter);
            }
        }
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
