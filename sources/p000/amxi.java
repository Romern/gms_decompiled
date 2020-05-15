package p000;

import java.util.List;
import org.json.JSONException;

/* renamed from: amxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amxi {

    /* renamed from: a */
    protected final ammz f76275a;

    /* renamed from: b */
    protected final amyo f76276b;

    /* renamed from: c */
    protected final amvt f76277c;

    /* renamed from: d */
    protected final anaz f76278d;

    /* renamed from: e */
    protected final amwt f76279e;

    /* renamed from: f */
    protected final amye f76280f;

    protected amxi(ammz ammz, amyo amyo, amvt amvt, anaz anaz, amwt amwt, amye amye) {
        this.f76275a = ammz;
        this.f76276b = amyo;
        this.f76277c = amvt;
        this.f76278d = anaz;
        this.f76279e = amwt;
        this.f76280f = amye;
    }

    /* renamed from: a */
    protected static alvf m63634a(ammz ammz) {
        ammz ammz2 = ammz.UNSPECIFIED;
        int ordinal = ammz.ordinal();
        if (ordinal == 1) {
            return alvf.INSERT;
        }
        if (ordinal == 2) {
            return alvf.UPDATE;
        }
        if (ordinal != 3) {
            return alvf.UNKNOWN_OPERATION;
        }
        return alvf.REMOVE;
    }

    /* renamed from: f */
    protected static final amnj m63635f(amvp amvp) {
        bxvd da = amnj.f75484c.mo74144da();
        long longValue = amvp.f76095d.longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amnj amnj = (amnj) da.f164949b;
        amnj.f75486a |= 1;
        amnj.f75487b = longValue;
        return (amnj) da.mo74062i();
    }

    /* renamed from: g */
    private final boolean m63636g(amvp amvp) {
        try {
            mo41531c(amvp);
            return true;
        } catch (amxy | chuw | gid | ArrayStoreException | JSONException e) {
            Exception exc = e;
            if (exc instanceof chuw) {
                alvf a = m63634a(this.f76275a);
                chuv chuv = ((chuw) exc).f189236a;
                int a2 = this.f76280f.mo41556a(a, chuv.f189233s.f189211r, chuv.f189234t);
                int i = a2 - 1;
                ammz ammz = ammz.UNSPECIFIED;
                if (a2 == 0) {
                    throw null;
                } else if (i == 1) {
                    mo41533e(amvp);
                    this.f76278d.mo41636a(this.f76275a, amjf.CONTACT, false, 3, 1);
                    return true;
                } else if (i == 5) {
                    return m63637h(amvp);
                }
            }
            if (amyg.m63718a(false, amjf.CONTACT, this.f76275a, exc, this.f76278d, 1) != ammz.REMOVE) {
                return false;
            }
            mo41533e(amvp);
            return true;
        }
    }

    /* renamed from: h */
    private final boolean m63637h(amvp amvp) {
        try {
            mo41532d(amvp);
            return true;
        } catch (amxy | chuw | gid | ArrayStoreException | JSONException e) {
            if (amyg.m63718a(false, amjf.CONTACT, this.f76275a, e, this.f76278d, 1) != ammz.REMOVE) {
                return false;
            }
            mo41533e(amvp);
            return true;
        } catch (UnsupportedOperationException e2) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo41530b(amvp amvp);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo41531c(amvp amvp);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo41532d(amvp amvp);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo41533e(amvp amvp) {
        this.f76277c.f76138b.mo41461a(amvp.f76095d, true);
        this.f76277c.mo41451b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41527a(amvp amvp, amvp amvp2) {
        this.f76276b.mo41566a(amvp, amvp2);
        this.f76277c.mo41451b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(java.lang.Long, boolean):void
     arg types: [java.lang.Long, int]
     candidates:
      amvu.a(java.lang.Long, android.content.ContentValues):void
      amvu.a(java.lang.Long, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41528a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f76277c.f76138b.mo41461a(((amvp) list.get(i)).f76095d, true);
        }
        this.f76277c.mo41451b();
    }

    /* renamed from: a */
    public final boolean mo41529a(amvp amvp) {
        this.f76278d.mo41636a(this.f76275a, amjf.CONTACT, false, 1, 1);
        if (!mo41530b(amvp)) {
            return false;
        }
        if (m63636g(amvp)) {
            return true;
        }
        if (cfwy.m143342b()) {
            this.f76278d.mo41638a(m63635f(amvp));
        }
        return false;
    }
}
