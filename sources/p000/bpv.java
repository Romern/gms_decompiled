package p000;

/* renamed from: bpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpv implements asry {

    /* renamed from: a */
    public bxm f5323a;

    /* renamed from: b */
    public cap f5324b;

    /* renamed from: c */
    public byte[] f5325c;

    /* renamed from: d */
    private final bpy f5326d = new bpy(this);

    static {
        bpv.class.getSimpleName();
    }

    public bpv() {
        int i = cbd.f6383a;
    }

    /* renamed from: a */
    public final assf mo3391a() {
        int i = cbd.f6383a;
        return this.f5326d;
    }

    /* renamed from: b */
    public final void mo3394b() {
        this.f5326d.f5331a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3392a(Exception exc, bxm bxm) {
        new Object[1][0] = bxm;
        int i = cbd.f6383a;
        if (exc != null) {
            if (exc instanceof bqh) {
                this.f5326d.mo3401a(((bqh) exc).f5364a);
            } else {
                this.f5326d.mo3401a(bqe.INTERNAL_ERROR);
            }
        } else if (bxm != null && bxm.mo3598f()) {
            if (bxn.APPROVED == bxm.f5985g) {
                this.f5326d.mo3400a(1);
            } else {
                this.f5326d.mo3401a(bqe.DECLINED);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Exception], assign insn: 0x0043: MOVE_EXCEPTION  (r10v6 ? I:java.lang.Exception A[CUSTOM_DECLARE]) =  */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final byte[] mo3393a(byte[] bArr) {
        byte[] bArr2;
        bxm bxm;
        int i = cbd.f6383a;
        long currentTimeMillis = System.currentTimeMillis();
        new Object[1][0] = bArr;
        bon bon = null;
        try {
            bpy bpy = this.f5326d;
            if (bpy.f5332b == 3) {
                bpy.mo3400a(0);
            }
            cao a = this.f5324b.mo3485a(bArr);
            bol a2 = a.mo3487a(this.f5323a, a.mo3486a(new bok(bArr)));
            byte[] a3 = a2.mo3339a();
            new Object[1][0] = a2;
            mo3392a(null, this.f5323a);
            cbd.m3884a("processApdu", currentTimeMillis);
            return a3;
        } catch (bon e) {
            bon = e;
            bArr2 = bon.f5257a;
            bxm = this.f5323a;
        } catch (Exception e2) {
            bon = e2;
            bArr2 = bop.f5271k;
            bxm = this.f5323a;
        } catch (Throwable th) {
            th = th;
            mo3392a(bon, this.f5323a);
            cbd.m3884a("processApdu", currentTimeMillis);
            throw th;
        }
        mo3392a(bon, bxm);
        cbd.m3884a("processApdu", currentTimeMillis);
        return bArr2;
    }
}
