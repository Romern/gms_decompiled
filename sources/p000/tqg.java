package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: tqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tqg extends tqk {

    /* renamed from: a */
    private final String f46491a;

    /* renamed from: b */
    private final bmxv f46492b;

    /* renamed from: c */
    private final String f46493c;

    /* renamed from: d */
    private final bmxv f46494d;

    /* renamed from: e */
    private final bskj f46495e;

    /* renamed from: f */
    private final qun f46496f;

    public tqg(String str, bmxv bmxv, String str2, bmxv bmxv2, bskj bskj, qun qun) {
        if (str != null) {
            this.f46491a = str;
            this.f46492b = bmxv;
            if (str2 != null) {
                this.f46493c = str2;
                this.f46494d = bmxv2;
                if (bskj != null) {
                    this.f46495e = bskj;
                    if (qun != null) {
                        this.f46496f = qun;
                        return;
                    }
                    throw new NullPointerException("Null passwordSpecificsData");
                }
                throw new NullPointerException("Null credentialType");
            }
            throw new NullPointerException("Null signonRealm");
        }
        throw new NullPointerException("Null username");
    }

    /* renamed from: a */
    public final String mo26726a() {
        return this.f46491a;
    }

    /* renamed from: b */
    public final bmxv mo26727b() {
        return this.f46492b;
    }

    /* renamed from: c */
    public final String mo26728c() {
        return this.f46493c;
    }

    /* renamed from: d */
    public final bmxv mo26729d() {
        return this.f46494d;
    }

    /* renamed from: e */
    public final bskj mo26730e() {
        return this.f46495e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqk) {
            tqk tqk = (tqk) obj;
            return this.f46491a.equals(tqk.mo26726a()) && this.f46492b.equals(tqk.mo26727b()) && this.f46493c.equals(tqk.mo26728c()) && this.f46494d.equals(tqk.mo26729d()) && this.f46495e.equals(tqk.mo26730e()) && this.f46496f.equals(tqk.mo26732f());
        }
    }

    /* renamed from: f */
    public final qun mo26732f() {
        return this.f46496f;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f46491a.hashCode() ^ 1000003) * 1000003) ^ this.f46492b.hashCode()) * 1000003) ^ this.f46493c.hashCode()) * 1000003) ^ this.f46494d.hashCode()) * 1000003) ^ this.f46495e.hashCode()) * 1000003;
        qun qun = this.f46496f;
        int i = qun.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(qun).mo74216a(qun);
            qun.f164758ag = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f46491a;
        String valueOf = String.valueOf(this.f46492b);
        String str2 = this.f46493c;
        String valueOf2 = String.valueOf(this.f46494d);
        String valueOf3 = String.valueOf(this.f46495e);
        String valueOf4 = String.valueOf(this.f46496f);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = str2.length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + ErrorInfo.TYPE_SDU_COMMUNICATIONERROR + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length());
        sb.append("Credential{username=");
        sb.append(str);
        sb.append(", password=");
        sb.append(valueOf);
        sb.append(", signonRealm=");
        sb.append(str2);
        sb.append(", federationUrl=");
        sb.append(valueOf2);
        sb.append(", credentialType=");
        sb.append(valueOf3);
        sb.append(", passwordSpecificsData=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
