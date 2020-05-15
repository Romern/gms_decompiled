package p000;

import android.content.ContentValues;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: agpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpr {

    /* renamed from: a */
    public final ContentValues f66252a = new ContentValues();

    /* renamed from: a */
    public final agps mo35883a() {
        return agps.m54783a(new ContentValues(this.f66252a));
    }

    /* renamed from: a */
    public final void mo35884a(Bitmap bitmap) {
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            this.f66252a.put("carrier_logo", byteArrayOutputStream.toByteArray());
            return;
        }
        this.f66252a.put("carrier_logo", (byte[]) null);
    }

    /* renamed from: a */
    public final void mo35885a(btap btap) {
        byte[] bArr;
        ContentValues contentValues = this.f66252a;
        if (btap != null) {
            bArr = btap.mo73642k();
        } else {
            bArr = null;
        }
        contentValues.put("list_cpid_endpoints_resp", bArr);
    }

    /* renamed from: a */
    public final void mo35886a(bxzw bxzw) {
        this.f66252a.put("carrier_extra", bxzw.mo73642k());
    }

    /* renamed from: a */
    public final void mo35887a(Long l) {
        this.f66252a.put("carrier_id", l);
    }
}
