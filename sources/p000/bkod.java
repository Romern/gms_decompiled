package p000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bkod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkod {

    /* renamed from: a */
    private static final Logger f124990a = Logger.getLogger("BrowserChannel");

    /* renamed from: b */
    private final StringBuilder f124991b = new StringBuilder();

    /* renamed from: c */
    private int f124992c;

    /* renamed from: d */
    private final Queue f124993d = new LinkedList();

    /* renamed from: e */
    private int f124994e = 1;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bkoc mo66160a() {
        return (bkoc) this.f124993d.poll();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.CharSequence, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo66161a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int i3 = this.f124994e;
            if (i3 == 1) {
                char charAt = charSequence.charAt(i);
                if (charAt == 10) {
                    String trim = this.f124991b.toString().trim();
                    try {
                        int parseInt = Integer.parseInt(trim);
                        this.f124992c = parseInt;
                        if (parseInt <= 0) {
                            Logger logger = f124990a;
                            Level level = Level.WARNING;
                            int i4 = this.f124992c;
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Ignored invalid length: ");
                            sb.append(i4);
                            logger.logp(level, "com.google.apps.brix.api.client.net.browserchannel.bind.EnvelopeBuffer", "handleData", sb.toString());
                        } else {
                            this.f124994e = 2;
                        }
                    } catch (NumberFormatException e) {
                        Logger logger2 = f124990a;
                        Level level2 = Level.WARNING;
                        String valueOf = String.valueOf(trim);
                        logger2.logp(level2, "com.google.apps.brix.api.client.net.browserchannel.bind.EnvelopeBuffer", "handleData", valueOf.length() == 0 ? new String("Ignored non-numeric length value: ") : "Ignored non-numeric length value: ".concat(valueOf));
                    }
                    this.f124991b.setLength(0);
                } else {
                    this.f124991b.append(charAt);
                }
            } else if (i3 == 2) {
                int min = Math.min((this.f124992c + i) - this.f124991b.length(), charSequence.length());
                this.f124991b.append(charSequence, i, min);
                i = min - 1;
                if (this.f124991b.length() == this.f124992c) {
                    try {
                        bkxi bkxi = new bkxi(this.f124991b.toString());
                        bkxi.mo66430c();
                        while (bkxi.f125378a) {
                            this.f124993d.add(bkoc.m106225a(bkxi));
                        }
                        bkxi.mo66431d();
                    } catch (bkqc | IllegalArgumentException | IllegalStateException e2) {
                        Logger logger3 = f124990a;
                        Level level3 = Level.WARNING;
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                        sb2.append("Ignored invalid server message: ");
                        sb2.append(valueOf2);
                        logger3.logp(level3, "com.google.apps.brix.api.client.net.browserchannel.bind.EnvelopeBuffer", "handleData", sb2.toString());
                    }
                    this.f124994e = 1;
                    this.f124991b.setLength(0);
                } else {
                    continue;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
