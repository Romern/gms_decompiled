package p000;

import android.content.ContextWrapper;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: bjpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpx extends bjon {

    /* renamed from: q */
    private bwvw f123120q;

    /* renamed from: r */
    private C1246ol f123121r;

    public bjpx(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo65414G() {
        bwvw bwvw = this.f123120q;
        return bwvw.f161188b == 3 ? (String) bwvw.f161189c : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo65415H() {
        bwvw bwvw = this.f123120q;
        return bwvw.f161188b == 1 ? (String) bwvw.f161189c : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo65416I() {
        return this.f123120q.f161190d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final String mo65443J() {
        return this.f123120q.f161191e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final C1246ol mo65444K() {
        if (this.f123121r == null) {
            bxwc bxwc = this.f123120q.f161192f;
            C1246ol olVar = new C1246ol(bxwc.size());
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bwvv bwvv = (bwvv) bxwc.get(i);
                olVar.mo15637a(Integer.parseInt(bwvv.f161181a), bwvv.f161182b);
            }
            this.f123121r = olVar;
        }
        return this.f123121r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwvw.f161185i;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123120q = (bwvw) b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjpy bjpy = (bjpy) ((bjhy) this).f122754m;
        return bjpy == null ? new bjpy() : bjpy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo65119d() {
        super.mo65119d();
        this.f123121r = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65102a(bwog bwog, bwog bwog2) {
        String str;
        List list;
        super.mo65102a(bwog, bwog2);
        int i = 0;
        String str2 = "";
        if (!TextUtils.isEmpty(((bjpy) ((bjhy) this).f122754m).f123123e)) {
            int parseInt = Integer.parseInt(((bjpy) ((bjhy) this).f122754m).f123123e);
            C1246ol K = mo65444K();
            if (!K.mo15645e(parseInt) || (list = (List) K.mo15646f(parseInt)) == null || list.isEmpty()) {
                str = str2;
            } else {
                str = (String) list.get(0);
            }
            bjpy bjpy = (bjpy) ((bjhy) this).f122754m;
            bjpy.mo65446a(str, bjpy.f123123e, bjpy.f123124f, bjpy.f123126h, null);
        }
        bwvw bwvw = this.f123120q;
        if ((bwvw.f161187a & 8) != 0) {
            bjpy bjpy2 = (bjpy) ((bjhy) this).f122754m;
            String str3 = bwvw.f161191e;
            bxwc bxwc = bwvw.f161192f;
            int size = bxwc.size();
            String str4 = str2;
            while (true) {
                if (i >= size) {
                    break;
                }
                bwvv bwvv = (bwvv) bxwc.get(i);
                String str5 = bwvv.f161181a;
                i++;
                if (bwvv.f161182b.contains(str3)) {
                    str4 = str5;
                    break;
                }
                str4 = str5;
            }
            bjpy2.f123122d = str4;
            if (TextUtils.isEmpty(bjpy2.f123123e)) {
                bjpy2.f123123e = str4;
            }
            if (TextUtils.isEmpty(bjpy2.f123125g)) {
                bjpy2.f123125g = str3;
            }
        }
        if (this.f123120q.f161193g) {
            bjpy bjpy3 = (bjpy) ((bjhy) this).f122754m;
            ContextWrapper contextWrapper = this.f122639a.f122692a.f122732i;
            if (C1145kt.m18540a(contextWrapper, "android.permission.READ_PHONE_STATE") == 0) {
                str2 = ((TelephonyManager) contextWrapper.getSystemService("phone")).getLine1Number();
            }
            String str6 = bjpy3.f123123e;
            if (str2.startsWith(str6) || TextUtils.isEmpty(str6)) {
                bjpy3.mo65446a(bjpy3.f123125g, str6, str2.substring(str6.length()), 2, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        String str;
        String str2;
        bxvj bxvj = bwvu.f161175d;
        bwoi.mo74135a(bxvj);
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return true;
        }
        bxvj bxvj2 = bwvu.f161175d;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        bwvu bwvu = (bwvu) b;
        int a = bwvt.m122354a(bwvu.f161177a);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i != 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwvt.m122354a(bwvu.f161177a);
            if (a2 != 1) {
                str2 = a2 != 2 ? "null" : "CONDITION_NOT_SET";
            } else {
                str2 = "REGION_CODE_MATCH";
            }
            objArr[0] = str2;
            mo65114b(String.format(locale, "PhoneInputCondition does not have valid condition: %s.", objArr));
            return true;
        } else {
            String str3 = ((bjpy) ((bjhy) this).f122754m).f123125g;
            if (bwvu.f161177a == 2) {
                str = (String) bwvu.f161178b;
            } else {
                str = "";
            }
            return TextUtils.equals(str3, str);
        }
    }
}
