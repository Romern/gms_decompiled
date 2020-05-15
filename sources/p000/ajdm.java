package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ajdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdm {

    /* renamed from: a */
    public final int f70390a;

    /* renamed from: b */
    public final aiye f70391b;

    /* renamed from: c */
    public final ajdr f70392c;

    /* renamed from: d */
    public final aiyo f70393d;

    /* renamed from: e */
    public final ajdt f70394e;

    /* renamed from: f */
    public int f70395f;

    /* renamed from: g */
    private rkl f70396g;

    public ajdm(int i, aiye aiye, ajdr ajdr, aiyo aiyo, ajdt ajdt, rkl rkl) {
        this.f70390a = i;
        this.f70391b = aiye;
        this.f70392c = ajdr;
        this.f70393d = aiyo;
        this.f70394e = ajdt;
        this.f70396g = rkl;
    }

    /* renamed from: a */
    public static ajdm m58552a(aiyo aiyo, rkl rkl) {
        sdo.m34959a(aiyo);
        return new ajdm(3, null, null, aiyo, null, rkl);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f70390a;
        aiye aiye = this.f70391b;
        String str4 = "";
        if (aiye != null) {
            String valueOf = String.valueOf(aiye);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb.append(", publish=");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = str4;
        }
        ajdr ajdr = this.f70392c;
        if (ajdr != null) {
            String valueOf2 = String.valueOf(ajdr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb2.append(", unpublish=");
            sb2.append(valueOf2);
            str2 = sb2.toString();
        } else {
            str2 = str4;
        }
        aiyo aiyo = this.f70393d;
        if (aiyo != null) {
            String valueOf3 = String.valueOf(aiyo);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
            sb3.append(", subscribe=");
            sb3.append(valueOf3);
            str3 = sb3.toString();
        } else {
            str3 = str4;
        }
        ajdt ajdt = this.f70394e;
        if (ajdt != null) {
            String valueOf4 = String.valueOf(ajdt);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 14);
            sb4.append(", unsubscribe=");
            sb4.append(valueOf4);
            str4 = sb4.toString();
        }
        String valueOf5 = String.valueOf(this.f70396g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb5 = new StringBuilder(length + 40 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(valueOf5).length());
        sb5.append("Operation{opCode=");
        sb5.append(i);
        sb5.append(str);
        sb5.append(str2);
        sb5.append(str3);
        sb5.append(str4);
        sb5.append(", callback=");
        sb5.append(valueOf5);
        sb5.append('}');
        return sb5.toString();
    }

    /* renamed from: a */
    public static ajdm m58553a(ajdr ajdr, rkl rkl) {
        sdo.m34959a(ajdr);
        return new ajdm(2, null, ajdr, null, null, rkl);
    }

    /* renamed from: b */
    public final void mo38507b(int i) {
        Status status = new Status(i, null);
        rkl rkl = this.f70396g;
        if (rkl == null) {
            srn srn = ahfq.f67120a;
            return;
        }
        rkl.mo9454a(status);
        this.f70396g = null;
        srn srn2 = ahfq.f67120a;
    }

    /* renamed from: a */
    public static ajdm m58554a(ajdt ajdt, rkl rkl) {
        sdo.m34959a(ajdt);
        return new ajdm(4, null, null, null, ajdt, rkl);
    }

    /* renamed from: a */
    public static boolean m58555a(int i) {
        for (Integer num : ajdl.f70389a) {
            if (num.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo38506a(int i, int i2) {
        if (this.f70395f != 5) {
            this.f70395f = i;
            if (i != 0 && i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        i2 = 0;
                    } else {
                        bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl.mo68432a("ajdm", "a", 167, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68409a("Unknown network status: %s", i);
                        return;
                    }
                }
                mo38507b(i2);
            }
        }
    }
}
