package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;

/* renamed from: iki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iki implements rkl {

    /* renamed from: a */
    final /* synthetic */ rkb f21198a;

    /* renamed from: b */
    final /* synthetic */ Context f21199b;

    /* renamed from: c */
    final /* synthetic */ bypc f21200c;

    /* renamed from: d */
    final /* synthetic */ byte[] f21201d;

    /* renamed from: e */
    final /* synthetic */ String f21202e;

    /* renamed from: f */
    final /* synthetic */ ikj f21203f;

    public iki(ikj ikj, rkb rkb, Context context, bypc bypc, byte[] bArr, String str) {
        this.f21203f = ikj;
        this.f21198a = rkb;
        this.f21199b = context;
        this.f21200c = bypc;
        this.f21201d = bArr;
        this.f21202e = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        this.f21203f.f21207c.mo12998a(this.f21198a);
        this.f21203f.f21207c.f20933a = this.f21199b;
        axos axos = new axos();
        axos.mo53331a("tx_request", this.f21200c.serializeToBytes());
        axos.mo53331a("key_handle", this.f21201d);
        axos.mo53328a("email", this.f21202e);
        ParcelFileDescriptor b = ((allh) rkk).mo40486b();
        if (b != null) {
            Bitmap a = alls.m61238a(b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            axos.mo53331a("profile_picture", byteArrayOutputStream.toByteArray());
        } else {
            ikj.f21205d.mo25416d("Failed to fetch the profile picture for %s", this.f21202e);
        }
        igs a2 = this.f21203f.f21207c.mo12997a("/send-tx-request", axos.mo53333a());
        if (cceo.m129401b()) {
            a2.mo12999a();
        } else {
            a2.mo13000b();
        }
    }
}
