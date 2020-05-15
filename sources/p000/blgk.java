package p000;

/* renamed from: blgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgk {

    /* renamed from: a */
    public blgl f126434a = blgl.KIND_NOT_SET;

    /* renamed from: b */
    public Object f126435b = null;

    /* renamed from: a */
    public final blgm mo66486a() {
        blgm blgm = new blgm(this);
        if (this.f126434a == blgl.NULL_VALUE) {
            this.f126434a = blgl.KIND_NOT_SET;
            this.f126435b = null;
        }
        if (this.f126434a == blgl.NUMBER_VALUE) {
            this.f126434a = blgl.KIND_NOT_SET;
            this.f126435b = null;
        }
        if (this.f126434a == blgl.STRING_VALUE) {
            this.f126434a = blgl.KIND_NOT_SET;
            this.f126435b = null;
        }
        if (this.f126434a == blgl.BOOL_VALUE) {
            this.f126434a = blgl.KIND_NOT_SET;
            this.f126435b = null;
        }
        if (this.f126434a == blgl.STRUCT_VALUE) {
            this.f126434a = blgl.KIND_NOT_SET;
            this.f126435b = null;
        }
        if (this.f126434a == blgl.LIST_VALUE) {
            this.f126434a = blgl.KIND_NOT_SET;
            this.f126435b = null;
        }
        return blgm;
    }

    /* renamed from: a */
    public final void mo66487a(double d) {
        this.f126434a = blgl.NUMBER_VALUE;
        this.f126435b = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo66488a(blgf blgf) {
        this.f126434a = blgl.NULL_VALUE;
        this.f126435b = blgf;
    }

    /* renamed from: a */
    public final void mo66489a(String str) {
        this.f126434a = blgl.STRING_VALUE;
        this.f126435b = str;
    }
}
