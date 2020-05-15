package p000;

/* renamed from: abrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abrq extends acpn {

    /* renamed from: a */
    final /* synthetic */ acxh f58048a;

    /* renamed from: b */
    final /* synthetic */ abrv f58049b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrq(abrv abrv, bqbd bqbd, String str, acxh acxh) {
        super(bqbd, str);
        this.f58049b = abrv;
        this.f58048a = acxh;
    }

    /* renamed from: b */
    public final void mo32291b() {
        acxh acxh = this.f58048a;
        if (("android.intent.action.PACKAGE_REMOVED".equals(acxh.f61009a.getAction()) && (!acxh.f61009a.getBooleanExtra("android.intent.extra.REPLACING", false) || (cemw.m137396d() && acxh.f61009a.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)))) || ("android.intent.action.PACKAGE_CHANGED".equals(acxh.f61009a.getAction()) && !acxh.mo33195d())) {
            this.f58049b.mo32308a(this.f58048a.mo33194c());
        } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(this.f58048a.f61009a.getAction())) {
            this.f58049b.mo32317b(this.f58048a.mo33194c());
        }
        if (this.f58048a.mo33193b()) {
            abrv abrv = this.f58049b;
            String c = this.f58048a.mo33194c();
            abrv.f58067c.mo32992b(2);
            abrv.mo32322e();
            absg.m48185a("handlePackageUpdating %s", c);
            abrv.f58077m.mo32510f(c);
        }
        if (this.f58048a.mo33192a()) {
            abrv abrv2 = this.f58049b;
            String c2 = this.f58048a.mo33194c();
            abrv2.f58067c.mo32992b(2);
            abrv2.mo32322e();
            absg.m48185a("handlePackageAdded %s", c2);
            if (!new abzq(abrv2.f58077m, abrv2.f58064C, abrv2.f58071g.mo33034h()).mo32551a(c2)) {
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 18);
                sb.append("Package ");
                sb.append(c2);
                sb.append(" not found");
                absg.m48191b(sb.toString());
            }
            if ("com.google.android.googlequicksearchbox".equals(c2) || "com.google.android.gms".equals(c2)) {
                abrv2.f58077m.mo32507d();
            }
            if ("com.google.android.gm".equals(c2)) {
                abrv2.f58077m.mo32508e();
            }
        }
    }
}
