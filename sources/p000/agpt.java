package p000;

import android.content.ContentValues;

/* renamed from: agpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpt {

    /* renamed from: a */
    public final ContentValues f66254a;

    public agpt() {
        this.f66254a = new ContentValues();
    }

    /* renamed from: a */
    public final agpu mo35893a() {
        return agpu.m54793a(new ContentValues(this.f66254a));
    }

    public agpt(ContentValues contentValues) {
        this.f66254a = new ContentValues(contentValues);
    }

    /* renamed from: a */
    public final void mo35894a(bxzx bxzx) {
        byte[] bArr;
        if (bxzx != null) {
            bArr = bxzx.serializeToBytes();
        } else {
            bArr = null;
        }
        this.f66254a.put("consent_record", bArr);
    }

    /* renamed from: a */
    public final void mo35895a(Long l) {
        this.f66254a.put("version_index", l);
    }
}
