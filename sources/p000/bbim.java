package p000;

/* renamed from: bbim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbim {

    /* renamed from: a */
    private final bbij f102740a;

    /* renamed from: b */
    private final batv f102741b;

    /* renamed from: c */
    private final bmzi f102742c;

    /* renamed from: d */
    private final int f102743d;

    /* renamed from: e */
    private final boolean f102744e;

    /* renamed from: f */
    private final int f102745f;

    public bbim(bbij bbij, batv batv, int i, bmzi bmzi, boolean z) {
        this.f102740a = bbij;
        this.f102741b = batv;
        this.f102745f = i;
        this.f102742c = bmzi;
        this.f102743d = !z ? 1 : 2;
        this.f102744e = z;
    }

    /* renamed from: a */
    public final void mo56150a() {
        String str;
        batv batv = this.f102741b;
        bbij bbij = this.f102740a;
        int i = this.f102745f;
        if (this.f102744e) {
            bbik bbik = (bbik) bbij;
            String str2 = bbik.f102732a;
            String str3 = bbik.f102733b;
            String str4 = bbik.f102734c;
            StringBuilder sb = new StringBuilder(str2.length() + 2 + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append(str2);
            sb.append("#");
            sb.append(str3);
            sb.append("#");
            sb.append(str4);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12);
            sb3.append(sb2);
            sb3.append(":");
            sb3.append(i - 1);
            str = sb3.toString();
        } else {
            bbik bbik2 = (bbik) bbij;
            String str5 = bbik2.f102732a;
            String str6 = bbik2.f102734c;
            StringBuilder sb4 = new StringBuilder(str5.length() + 40 + String.valueOf(str6).length());
            sb4.append("ApplicationId{packageName=");
            sb4.append(str5);
            sb4.append(", instanceId=");
            sb4.append(str6);
            sb4.append("}");
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 12);
            sb6.append(sb5);
            sb6.append(":");
            sb6.append(i - 1);
            str = sb6.toString();
        }
        bpwx a = batv.mo55958a(str);
        if (a != null) {
            bbin bbin = (bbin) this.f102742c.mo6606a();
            int i2 = this.f102745f;
            bxvd da = bbic.f102696f.mo74144da();
            int i3 = (int) a.f139588d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbic bbic = (bbic) da.f164949b;
            bbic.f102698a |= 16;
            bbic.f102701d = i3;
            bxvd da2 = bbib.f102689f.mo74144da();
            bbik bbik3 = (bbik) this.f102740a;
            String str7 = bbik3.f102733b;
            String str8 = bbik3.f102734c;
            if (str8 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bbib bbib = (bbib) da2.f164949b;
                str8.getClass();
                bbib.f102691a |= 16;
                bbib.f102695e = str8;
            }
            if (this.f102744e && str7 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bbib bbib2 = (bbib) da2.f164949b;
                str7.getClass();
                bbib2.f102691a |= 8;
                bbib2.f102694d = str7;
            }
            int i4 = this.f102743d;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bbib bbib3 = (bbib) da2.f164949b;
            int i5 = bbib3.f102691a | 2;
            bbib3.f102691a = i5;
            bbib3.f102692b = i4;
            String str9 = ((bbik) this.f102740a).f102732a;
            str9.getClass();
            bbib3.f102691a = i5 | 4;
            bbib3.f102693c = str9;
            bbib bbib4 = (bbib) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbic bbic2 = (bbic) da.f164949b;
            bbib4.getClass();
            bbic2.f102702e = bbib4;
            bbic2.f102698a |= 32;
            bxvd da3 = bbid.f102703c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bbid bbid = (bbid) da3.f164949b;
            a.getClass();
            bbid.f102706b = a;
            bbid.f102705a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bbic bbic3 = (bbic) da.f164949b;
            bbid bbid2 = (bbid) da3.mo74062i();
            bbid2.getClass();
            bbic3.f102700c = bbid2;
            bbic3.f102699b = 4;
            bbin.mo56151a(i2, (bbic) da.mo74062i());
        }
    }

    public bbim(bbij bbij, batv batv, bmzi bmzi) {
        this.f102740a = bbij;
        this.f102741b = batv;
        this.f102745f = 3002;
        this.f102742c = bmzi;
        this.f102743d = 1;
        this.f102744e = false;
    }
}
