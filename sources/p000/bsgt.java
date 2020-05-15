package p000;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: bsgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsgt {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            bsht bsht = new bsht(stringWriter);
            bsht.f144627c = true;
            bshq.f144606v.mo70552a(bsht, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
