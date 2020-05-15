package p000;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aotf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aotf extends rtr {

    /* renamed from: d */
    protected final String f83581d;

    /* renamed from: e */
    public int f83582e;

    /* renamed from: f */
    private final boolean f83583f;

    public aotf(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f83581d = str2;
        this.f83583f = TextUtils.isEmpty(str);
    }

    /* renamed from: b */
    protected static String m69487b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String valueOf = String.valueOf(str);
        return str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25144a(int i) {
        super.mo25144a(i);
        this.f83582e = this.f43672a.mo17762a(this.f43673b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Long mo46855h(String str) {
        if (!mo25154f(str)) {
            return Long.valueOf(this.f43672a.mo17763a(str, this.f43673b, this.f43674c));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Integer mo46856i(String str) {
        if (!mo25154f(str)) {
            return Integer.valueOf(mo25146b(str));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Double mo46857j(String str) {
        if (mo25154f(str)) {
            return null;
        }
        DataHolder dataHolder = this.f43672a;
        int i = this.f43673b;
        int i2 = this.f43674c;
        dataHolder.mo17765a(str, i);
        return Double.valueOf(dataHolder.f30164d[i2].getDouble(i, dataHolder.f30163c.getInt(str)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo46858k(String str) {
        if (this.f83583f) {
            return str;
        }
        String str2 = this.f83581d;
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final List mo46859l(String str) {
        if (mo25154f(str)) {
            return new ArrayList(0);
        }
        String d = mo25151d(str);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(d)) {
            for (String str2 : TextUtils.split(d, ",")) {
                arrayList.add(Integer.valueOf(str2));
            }
        }
        return arrayList;
    }
}
