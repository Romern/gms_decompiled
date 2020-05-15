package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkn {
    /* renamed from: a */
    static int m103782a(bjka bjka, int i) {
        bwyi bwyi = bwyi.FONT_WEIGHT_UNKNOWN;
        int ordinal = ((bwyi) bjka.mo65329b(6, i, bwyi.class)).ordinal();
        if (ordinal == 1) {
            return 300;
        }
        if (ordinal == 3) {
            return 500;
        }
        if (ordinal == 4) {
            return 700;
        }
        if (ordinal != 5) {
            return ordinal != 6 ? 400 : 900;
        }
        return 800;
    }

    /* renamed from: b */
    public static void m103786b(bjkk bjkk, bjka bjka, TextView textView) {
        bjka a = bjka.mo65323a(8);
        if (a != null) {
            m103788c(bjkk, a, textView);
        }
    }

    /* renamed from: c */
    static void m103788c(bjkk bjkk, bjka bjka, TextView textView) {
        int i;
        int i2;
        boolean z = true;
        if (bjkk.mo65338a(bjka, 3) && bjka.mo65327a(3, bjkk.f122860e)) {
            textView.setTextColor(bjka.mo65330c(3, bjkk.f122860e));
        }
        if (bjkk.mo65338a(bjka, 1, 4, 6)) {
            String a = bjka.f122848d.mo65309a(bjka.mo65331d(1, bjkk.f122860e));
            if (!a.equals("Google Sans")) {
                Typeface create = Typeface.create(a, 0);
                int i3 = bjkk.f122860e;
                int a2 = m103782a(bjka, i3);
                boolean b = m103787b(bjka, i3);
                int i4 = Build.VERSION.SDK_INT;
                textView.setTypeface(Typeface.create(create, a2, b));
            } else {
                int i5 = bjkk.f122860e;
                int a3 = m103782a(bjka, i5);
                boolean b2 = m103787b(bjka, i5);
                if (a3 > 400) {
                    i = C0126R.font.google_sans_medium;
                } else {
                    i = C0126R.font.google_sans;
                }
                Typeface a4 = C1163lk.m19265a(bjkk.f122857b, i);
                if (!b2) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
                textView.setTypeface(Typeface.create(a4, i2));
            }
        }
        if (bjkk.mo65338a(bjka, 2) && bjka.mo65327a(2, bjkk.f122860e)) {
            textView.setTextSize(((bwya) bjka.mo65324a(2, bjkk.f122860e, bwya.class)).f161437c);
        }
        if (bjkk.mo65338a(bjka, 7) && bjka.mo65327a(7, bjkk.f122860e)) {
            C1334rs.m20109c(textView, bjkl.m103780a((bwya) bjka.mo65324a(7, bjkk.f122860e, bwya.class)));
        }
        if (bjkk.mo65338a(bjka, 5) && bjka.mo65327a(5, bjkk.f122860e)) {
            int i6 = Build.VERSION.SDK_INT;
            textView.setLetterSpacing(((bwya) bjka.mo65324a(5, bjkk.f122860e, bwya.class)).f161437c);
        }
        if (bjkk.mo65338a(bjka, 8)) {
            if (!bjka.mo65327a(8, bjkk.f122860e) || bjka.mo65329b(8, bjkk.f122860e, bwyg.class) != bwyg.FONT_TRANSFORMATION_UPPERCASE) {
                z = false;
            }
            textView.setAllCaps(z);
        }
    }

    /* renamed from: a */
    public static void m103783a(bjkk bjkk, TextView textView) {
        bjjz bjjz = bjkk.f122859d;
        bjkp.m103790a(bjkk, textView);
        m103784a(bjkk, bjjz.mo65320b(), textView);
        m103786b(bjkk, bjjz.mo65318a(), textView);
    }

    /* renamed from: a */
    static void m103784a(bjkk bjkk, bjka bjka, TextView textView) {
        m103785a(bjkk, bjka, textView, 8388659);
    }

    /* renamed from: b */
    static boolean m103787b(bjka bjka, int i) {
        return bjka.mo65329b(4, i, bwye.class) == bwye.FONT_STYLE_ITALIC;
    }

    /* renamed from: a */
    public static void m103785a(bjkk bjkk, bjka bjka, TextView textView, int i) {
        if (bjkk.mo65338a(bjka, 10)) {
            textView.setGravity(bjke.m103764a((bwwz) bjka.mo65324a(10, bjkk.f122860e, bwwz.class), i));
        }
    }
}
