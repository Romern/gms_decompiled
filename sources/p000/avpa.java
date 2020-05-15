package p000;

import java.io.IOException;

/* renamed from: avpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpa {
    /* renamed from: a */
    public static bmxv m78976a(String str) {
        bmxv bmxv = bmvz.f131120a;
        try {
            bmxv = bnjd.m109599f(avlz.m78770a(bmxx.m108578b((String) avma.f93363i.mo51364a())), new avoy(str));
        } catch (IOException e) {
        }
        if (!bmxv.mo66813a()) {
            try {
                bmxv = bnjd.m109599f(avlz.m78772b(bmxx.m108578b(cfsg.f185570a.mo6606a().mo82653y())), new avoz(str));
            } catch (IOException e2) {
            }
            if (!bmxv.mo66813a()) {
                return bmvz.f131120a;
            }
        }
        return bmxv;
    }
}
