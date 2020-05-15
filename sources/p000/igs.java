package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: igs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igs implements rjz, rka {

    /* renamed from: f */
    public static final Logger f20937f = new Logger(igs.class.getSimpleName());

    /* renamed from: a */
    public final Context f20938a;

    /* renamed from: b */
    public final rkb f20939b;

    /* renamed from: c */
    public final String f20940c;

    /* renamed from: d */
    public final boolean f20941d = true;

    /* renamed from: e */
    public final byte[] f20942e;

    /* renamed from: g */
    rjx f20943g;

    /* renamed from: h */
    rjx f20944h;

    public igs(Context context, rkb rkb, axsg axsg, axsn axsn, String str, byte[] bArr) {
        bmxy.m108581a(context);
        this.f20938a = context;
        bmxy.m108581a(rkb);
        this.f20939b = rkb;
        rkb.mo24790a((rjz) this);
        this.f20939b.mo24791a((rka) this);
        bmxy.m108581a(axsg);
        bmxy.m108581a(axsn);
        bmxy.m108581a(str);
        this.f20940c = str;
        this.f20942e = (byte[]) bmxy.m108581a(bArr);
    }

    /* renamed from: a */
    public final void mo12999a() {
        bmxy.m108581a(this.f20938a);
        if (this.f20944h == null) {
            this.f20944h = axoz.m82856d(this.f20938a);
        }
        aucb a = sdl.m34956a(axsn.m83145a(this.f20944h.f43165D), axso.f96308a);
        a.mo50373a(new igl(this));
        a.mo50372a(igm.f20926a);
    }

    /* renamed from: b */
    public final void mo13000b() {
        this.f20939b.mo24801e();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        axsn.m83145a(this.f20939b).mo9458a(new igp(this));
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        f20937f.mo25414c("onConnectionSuspended with code: %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        f20937f.mo25418e("GoogleApiClient connection failed. Error code: %d", Integer.valueOf(connectionResult.f30065c));
    }
}
