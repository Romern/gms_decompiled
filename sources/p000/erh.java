package p000;

/* renamed from: erh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class erh extends C0942ds {
    public erh(C0953ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    public final String mo10122a() {
        return "INSERT OR REPLACE INTO `resource_info` (`accountName`,`language`,`resourceKey`,`darkModeEnabled`,`callingAndroidApp`,`resource`,`lastUpdatedMs`) VALUES (?,?,?,?,?,?,?)";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9522a(C0939dp dpVar, Object obj) {
        ern ern = (ern) obj;
        String str = ern.f15567a;
        if (str == null) {
            dpVar.mo8917a(1);
        } else {
            dpVar.mo8919a(1, str);
        }
        String str2 = ern.f15568b;
        if (str2 == null) {
            dpVar.mo8917a(2);
        } else {
            dpVar.mo8919a(2, str2);
        }
        byte[] a = epp.m10914a(ern.f15569c);
        if (a == null) {
            dpVar.mo8917a(3);
        } else {
            dpVar.mo8920a(3, a);
        }
        dpVar.mo8918a(4, ern.f15570d ? 1 : 0);
        String str3 = ern.f15571e;
        if (str3 == null) {
            dpVar.mo8917a(5);
        } else {
            dpVar.mo8919a(5, str3);
        }
        epq epq = ern.f15572f;
        if (epq != null) {
            byte[] a2 = epp.m10913a(epq.f15491a);
            if (a2 == null) {
                dpVar.mo8917a(6);
            } else {
                dpVar.mo8920a(6, a2);
            }
            dpVar.mo8918a(7, epq.f15492b);
            return;
        }
        dpVar.mo8917a(6);
        dpVar.mo8917a(7);
    }
}
