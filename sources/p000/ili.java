package p000;

/* renamed from: ili */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ili implements aubq {

    /* renamed from: a */
    final /* synthetic */ ilm f21290a;

    public ili(ilm ilm) {
        this.f21290a = ilm;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50387e() != null) {
            ilm.f21293a.mo25417e("startNewAccountCheckinAsync throwing Exception: ", aucb.mo50387e(), new Object[0]);
            return;
        }
        int intValue = ((Integer) aucb.mo50386d()).intValue();
        if (!rjs.m33680f(intValue)) {
            Logger Logger = ilm.f21293a;
            StringBuilder sb = new StringBuilder(27);
            sb.append("Checkin failed: ");
            sb.append(intValue);
            Logger.mo25418e(sb.toString(), new Object[0]);
            return;
        }
        aucb a = this.f21290a.f21296c.mo24701a((rpa) new qck());
        a.mo50373a(new ilk());
        a.mo50372a(new ilj());
    }
}
