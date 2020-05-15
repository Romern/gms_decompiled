package p000;

import java.util.Map;

/* renamed from: bxut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxut {
    /* renamed from: a */
    static int m123747a(Map.Entry entry) {
        return ((bxvi) entry.getKey()).f164953a;
    }

    /* renamed from: b */
    static bxux m123751b(Object obj) {
        return ((bxvg) obj).mo74136c();
    }

    /* renamed from: c */
    static final void m123752c(Object obj) {
        m123748a(obj).mo73914b();
    }

    /* renamed from: a */
    static bxux m123748a(Object obj) {
        return ((bxvg) obj).f164952m;
    }

    /* renamed from: a */
    static void m123749a(bxul bxul, Map.Entry entry) {
        bxvi bxvi = (bxvi) entry.getKey();
        bxzf bxzf = bxzf.DOUBLE;
        switch (bxvi.f164954b.ordinal()) {
            case 0:
                bxul.mo73874a(bxvi.f164953a, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                bxul.mo73875a(bxvi.f164953a, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                bxul.mo73877a(bxvi.f164953a, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                bxul.mo73887c(bxvi.f164953a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                bxul.mo73886c(bxvi.f164953a, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                bxul.mo73889d(bxvi.f164953a, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                bxul.mo73888d(bxvi.f164953a, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                bxul.mo73882a(bxvi.f164953a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                bxul.mo73881a(bxvi.f164953a, (String) entry.getValue());
                return;
            case 9:
                bxul.mo73885b(bxvi.f164953a, entry.getValue(), bxxm.f165037a.mo74227a((Class) entry.getValue().getClass()));
                return;
            case 10:
                bxul.mo73880a(bxvi.f164953a, entry.getValue(), bxxm.f165037a.mo74227a((Class) entry.getValue().getClass()));
                return;
            case 11:
                bxul.mo73878a(bxvi.f164953a, (bxtx) entry.getValue());
                return;
            case 12:
                bxul.mo73890e(bxvi.f164953a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                bxul.mo73886c(bxvi.f164953a, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                bxul.mo73876a(bxvi.f164953a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                bxul.mo73884b(bxvi.f164953a, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                bxul.mo73892f(bxvi.f164953a, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                bxul.mo73891e(bxvi.f164953a, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    static void m123750a(bxxp bxxp, Object obj, bxus bxus, bxux bxux) {
        bxvj bxvj = (bxvj) obj;
        bxux.mo73908a(bxvj.f164958d, bxxp.mo73683a(bxvj.f164957c.getClass(), bxus));
    }
}
