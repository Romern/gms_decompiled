package p000;

import com.google.android.gms.drive.DriveSpace;

/* renamed from: txx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class txx extends vps {

    /* renamed from: a */
    protected final uhn f46968a;

    /* renamed from: b */
    protected final uey f46969b;

    /* renamed from: c */
    public int f46970c = 0;

    public txx(uhn uhn, uih uih, boolean z) {
        super(z);
        sdo.m34959a(uhn);
        this.f46968a = uhn;
        sdo.m34959a(uih);
        this.f46969b = uey.m38255a(uih);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo26930a(ujx ujx) {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: voz.a(boolean, com.google.android.gms.drive.DriveId):uog
     arg types: [int, com.google.android.gms.drive.DriveId]
     candidates:
      voz.a(long, long):uog
      voz.a(long, com.google.android.gms.drive.auth.AppIdentity):uog
      voz.a(long, java.lang.String):uog
      voz.a(java.lang.String, java.lang.Iterable):uog
      voz.a(boolean, com.google.android.gms.drive.DriveId):uog */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final uig mo26931b(ujx ujx) {
        if (!ujx.mo27640w()) {
            return null;
        }
        this.f46970c++;
        return this.f46968a.mo27395a(this.f46969b, DriveSpace.f30737d, voz.m40972a(false, ujx.mo27610g()));
    }
}
