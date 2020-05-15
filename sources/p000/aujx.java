package p000;

/* renamed from: aujx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujx extends auke {

    /* renamed from: a */
    private final auju f91960a = new auju();

    /* renamed from: a */
    private final void m77197a(auji auji, long j, auju auju, int i) {
        bxvd b = auji.mo50591b();
        bkb bkb = bkb.NOTIFICATION_ITEM;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bzzx bzzx = (bzzx) b.f164949b;
        bzzx bzzx2 = bzzx.f172237al;
        bzzx.f172275d = bkb.f4944CA;
        int i2 = bzzx.f172265a | 2;
        bzzx.f172265a = i2;
        bzzx.f172274c = i - 1;
        int i3 = i2 | 1;
        bzzx.f172265a = i3;
        String str = auju.f91957a;
        str.getClass();
        int i4 = i3 | 16;
        bzzx.f172265a = i4;
        bzzx.f172277f = str;
        auju auju2 = this.f91960a;
        int i5 = auju2.f91958b;
        int i6 = i4 | 512;
        bzzx.f172265a = i6;
        bzzx.f172282k = i5;
        String str2 = auju2.f91959c;
        str2.getClass();
        int i7 = i6 | 1024;
        bzzx.f172265a = i7;
        bzzx.f172283l = str2;
        bzzx.f172265a = i7 | 4;
        bzzx.f172276e = j;
        auji.mo50588a(b);
    }

    /* renamed from: a */
    public final int mo50597a() {
        return 27510;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50598a(auji auji, long j, Object[] objArr) {
        Object[] objArr2 = objArr;
        boolean c = cgzf.m147724c();
        if (!auji.mo50594b("disable_old_visibility_logs")) {
            int length = objArr2.length;
            if (length >= 2) {
                try {
                    String[] split = ((String) objArr2[0]).split(";");
                    String[] split2 = ((String) objArr2[1]).split(";");
                    for (String str : split) {
                        if (this.f91960a.mo50601a(str)) {
                            m77197a(auji, j, this.f91960a, 2);
                        } else if (c) {
                            String valueOf = String.valueOf(str);
                            if (valueOf.length() == 0) {
                                new String("unable to parse key: ");
                            } else {
                                "unable to parse key: ".concat(valueOf);
                            }
                        }
                    }
                    for (String str2 : split2) {
                        if (this.f91960a.mo50601a(str2)) {
                            m77197a(auji, j, this.f91960a, 3);
                        } else if (c) {
                            String valueOf2 = String.valueOf(str2);
                            if (valueOf2.length() == 0) {
                                new String("unable to parse key: ");
                            } else {
                                "unable to parse key: ".concat(valueOf2);
                            }
                        }
                    }
                } catch (ClassCastException e) {
                }
            } else if (c) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("wrong number of operands: ");
                sb.append(length);
                sb.toString();
            }
        }
    }
}
