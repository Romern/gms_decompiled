package p000;

import java.io.IOException;
import java.io.StringReader;

/* renamed from: bsgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgy {
    /* renamed from: a */
    public static final bsgt m115760a(bshr bshr) {
        boolean z = bshr.f144608a;
        bshr.f144608a = true;
        try {
            bsgt a = bshl.m115782a(bshr);
            bshr.f144608a = z;
            return a;
        } catch (StackOverflowError e) {
            throw new bsgx("Failed parsing JSON source: " + bshr + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new bsgx("Failed parsing JSON source: " + bshr + " to Json", e2);
        } catch (Throwable th) {
            bshr.f144608a = z;
            throw th;
        }
    }

    /* renamed from: a */
    public static final bsgt m115761a(String str) {
        try {
            bshr bshr = new bshr(new StringReader(str));
            bsgt a = m115760a(bshr);
            if (!(a instanceof bsgv)) {
                if (bshr.mo70614n() != 10) {
                    throw new bsha("Did not consume the entire document.");
                }
            }
            return a;
        } catch (bshu e) {
            throw new bsha(e);
        } catch (IOException e2) {
            throw new bsgu(e2);
        } catch (NumberFormatException e3) {
            throw new bsha(e3);
        }
    }
}
