package p000;

import java.util.Set;

/* renamed from: uoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class uoa {

    /* renamed from: a */
    private int f48369a = 4;

    /* renamed from: c */
    public int f48370c = 1;

    /* renamed from: d */
    public int[] f48371d = new int[4];

    /* renamed from: e */
    public Object[] f48372e = new Object[4];

    /* renamed from: f */
    protected Object f48373f = null;

    /* renamed from: g */
    protected int f48374g = 0;

    /* renamed from: b */
    public static uoa m39042b() {
        return new uoa();
    }

    /* renamed from: a */
    public final unp mo27745a(int i, unt unt) {
        return new unp(i, unt, this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: c */
    public final void mo27749c(int i, String str) {
        boolean z;
        if (this.f48373f != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "No field definition to rename");
        unx unx = (unx) this.f48373f;
        unx unx2 = new unx(str, unx.f48365i, unx.f48358b, unx.f48360d, unx.f48361e, unx.f48363g, unx.f48362f, unx.f48359c, unx.f48364h);
        mo27748b(i);
        mo27746a(i, unx2);
    }

    /* renamed from: b */
    private final void m39043b(int i, Object obj) {
        if (i == this.f48374g) {
            this.f48372e[this.f48370c - 1] = obj;
        } else {
            int i2 = this.f48370c;
            int i3 = this.f48369a;
            if (i2 == i3) {
                int i4 = i3 + 4;
                this.f48369a = i4;
                int[] iArr = new int[i4];
                Object[] objArr = new Object[i4];
                System.arraycopy(this.f48371d, 0, iArr, 0, i2);
                System.arraycopy(this.f48372e, 0, objArr, 0, this.f48370c);
                this.f48371d = iArr;
                this.f48372e = objArr;
            }
            int[] iArr2 = this.f48371d;
            int i5 = this.f48370c;
            iArr2[i5] = i;
            this.f48372e[i5] = obj;
            this.f48370c = i5 + 1;
        }
        this.f48373f = obj;
        this.f48374g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27746a(int i, Object obj) {
        if (this.f48373f != null) {
            throw new IllegalStateException("Cannot add a new definition until the existing definition is removed");
        } else if (i >= this.f48374g) {
            m39043b(i, obj);
        } else {
            throw new IllegalArgumentException("Versions must be 0 or greater and specified in non-descending order");
        }
    }

    /* renamed from: a */
    public final void mo27747a(int i, unu unu) {
        boolean z;
        Set set = unu.f48348e;
        if (set == null || !set.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = unu.f48346c;
        if (z2) {
            if (unu.f48352i != 1) {
                unu.f48349f = true;
            }
            if (z) {
                unu.f48348e = null;
            }
            unu.f48347d = false;
        } else if (z) {
            unu.f48347d = false;
        }
        mo27746a(i, new unx(unu.f48344a, unu.f48352i, z2, unu.f48347d, unu.f48348e, unu.f48349f, unu.f48350g, unu.f48345b, unu.f48351h));
    }

    /* renamed from: b */
    public final void mo27748b(int i) {
        if (this.f48373f == null) {
            throw new IllegalStateException("No definition to remove");
        } else if (i > this.f48374g) {
            m39043b(i, null);
        } else {
            throw new IllegalArgumentException("Versions must be 0 or greater and specified in ascending order");
        }
    }
}
