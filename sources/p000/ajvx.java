package p000;

import android.os.Build;
import java.util.List;

/* renamed from: ajvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvx {
    /* renamed from: a */
    public static String m59119a(boab boab) {
        String str = boac.m110961a(boab).f132440a;
        int i = Build.VERSION.SDK_INT;
        return C1212ne.m19667a(str, 63).toString();
    }

    /* renamed from: a */
    public static String m59120a(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(m59119a((boab) list.get(i)));
        }
        return sb.toString();
    }
}
