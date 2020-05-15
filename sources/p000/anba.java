package p000;

/* renamed from: anba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anba {

    /* renamed from: a */
    public String f76520a;

    /* renamed from: b */
    public int f76521b;

    /* renamed from: c */
    private Long f76522c;

    /* renamed from: d */
    private Long f76523d;

    /* renamed from: e */
    private Integer f76524e;

    /* renamed from: f */
    private Integer f76525f;

    /* renamed from: g */
    private Boolean f76526g;

    /* renamed from: a */
    public final amlb mo41642a() {
        String str = this.f76520a == null ? " name" : "";
        if (this.f76522c == null) {
            str = str.concat(" startTimeMicroSec");
        }
        if (this.f76523d == null) {
            str = String.valueOf(str).concat(" timeDurationMicroSec");
        }
        if (this.f76524e == null) {
            str = String.valueOf(str).concat(" subEventCount");
        }
        if (this.f76521b == 0) {
            str = String.valueOf(str).concat(" networkType");
        }
        if (this.f76525f == null) {
            str = String.valueOf(str).concat(" payloadSize");
        }
        if (this.f76526g == null) {
            str = String.valueOf(str).concat(" networkEvent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        anas anas = new anas(this.f76520a, this.f76522c.longValue(), this.f76523d.longValue(), this.f76524e.intValue(), this.f76521b, this.f76525f.intValue(), this.f76526g.booleanValue());
        bxvd da = amlb.f75151g.mo74144da();
        String str2 = anas.f76506a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amlb amlb = (amlb) da.f164949b;
        str2.getClass();
        amlb.f75153a |= 1;
        amlb.f75154b = str2;
        long j = anas.f76507b;
        amlb amlb2 = (amlb) da.f164949b;
        amlb2.f75153a |= 2;
        amlb2.f75155c = j;
        long j2 = anas.f76508c;
        amlb amlb3 = (amlb) da.f164949b;
        amlb3.f75153a |= 4;
        amlb3.f75156d = j2;
        int i = anas.f76509d;
        amlb amlb4 = (amlb) da.f164949b;
        amlb4.f75153a |= 8;
        amlb4.f75157e = i;
        if (cfwa.f185820a.mo6606a().mo82812a() || anas.f76510e) {
            bxvd da2 = amla.f75146d.mo74144da();
            int i2 = anas.f76511f;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amla amla = (amla) da2.f164949b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                amla.f75149b = i3;
                amla.f75148a |= 1;
                int i4 = anas.f76509d;
                amla amla2 = (amla) da2.f164949b;
                amla2.f75148a |= 2;
                amla2.f75150c = i4;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amlb amlb5 = (amlb) da.f164949b;
                amla amla3 = (amla) da2.mo74062i();
                amla3.getClass();
                amlb5.f75158f = amla3;
                amlb5.f75153a |= 16;
            } else {
                throw null;
            }
        }
        return (amlb) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo41646b(int i) {
        this.f76524e = Integer.valueOf(i);
    }

    /* renamed from: b */
    public final void mo41647b(long j) {
        this.f76523d = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo41643a(int i) {
        this.f76525f = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo41644a(long j) {
        this.f76522c = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo41645a(boolean z) {
        this.f76526g = Boolean.valueOf(z);
    }
}
