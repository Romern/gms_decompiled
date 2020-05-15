package p000;

import android.content.ContentValues;
import android.os.Bundle;

/* renamed from: ansz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansz {

    /* renamed from: a */
    public static final String[] f77707a = {"url", "type", "title", "description", "thumbnailUrl", "callToActionDisplayName"};

    /* renamed from: b */
    public final ContentValues f77708b;

    public ansz(ContentValues contentValues) {
        this.f77708b = contentValues;
    }

    /* renamed from: a */
    public final String mo42207a() {
        return this.f77708b.getAsString("type");
    }

    /* renamed from: b */
    public final String mo42208b() {
        return this.f77708b.getAsString("title");
    }

    /* renamed from: c */
    public final String mo42209c() {
        return this.f77708b.getAsString("thumbnailUrl");
    }

    /* renamed from: d */
    public final Bundle mo42210d() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("content_values", this.f77708b);
        return bundle;
    }

    public ansz(Bundle bundle) {
        this.f77708b = (ContentValues) bundle.getParcelable("content_values");
    }
}
