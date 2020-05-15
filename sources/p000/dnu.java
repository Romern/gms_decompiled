package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.slice.Slice;
import com.google.android.chimera.ContentProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dnu extends ContentProvider {

    /* renamed from: a */
    public List f13651a;

    /* renamed from: b */
    private final String[] f13652b;

    public dnu() {
        this.f13652b = new String[0];
    }

    /* renamed from: a */
    public abstract Slice mo9323a(Uri uri);

    /* renamed from: a */
    public abstract boolean mo9324a();

    /* renamed from: b */
    public void mo9325b(Uri uri) {
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    public final Uri canonicalize(Uri uri) {
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        int i = Build.VERSION.SDK_INT;
        return "vnd.android.slice";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        int i = Build.VERSION.SDK_INT;
        this.f13651a = new ArrayList(apl.m1813a(getContext()).f1930a.getPinnedSlices());
        int i2 = Build.VERSION.SDK_INT;
        return mo9324a();
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public dnu(String... strArr) {
        this.f13652b = strArr;
    }

    public final Object getChimeraImpl() {
        int i = Build.VERSION.SDK_INT;
        return new dnv(this, this.f13652b);
    }
}
