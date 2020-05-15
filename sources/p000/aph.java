package p000;

import android.app.RemoteInput;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.content.res.Resources;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.util.Log;
import androidx.slice.SliceItem;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: aph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aph {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static Slice m1805a(androidx.slice.Slice slice) {
        char c;
        if (slice == null || slice.mo2043a() == null) {
            return null;
        }
        Slice.Builder builder = new Slice.Builder(slice.mo2043a(), m1806a(slice.f1652c));
        builder.addHints(slice.mo2046c());
        SliceItem[] sliceItemArr = slice.f1653d;
        for (SliceItem sliceItem : sliceItemArr) {
            String str = sliceItem.f1657b;
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (str.equals("int")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3327612:
                    if (str.equals("long")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    builder.addSubSlice(m1805a(sliceItem.mo2056f()), sliceItem.f1658c);
                    break;
                case 1:
                    builder.addIcon(sliceItem.mo2053c().mo1113e(), sliceItem.f1658c, sliceItem.mo2048a());
                    break;
                case 2:
                    builder.addRemoteInput((RemoteInput) sliceItem.f1659d, sliceItem.f1658c, sliceItem.mo2048a());
                    break;
                case 3:
                    builder.addAction(sliceItem.mo2054d(), m1805a(sliceItem.mo2056f()), sliceItem.f1658c);
                    break;
                case 4:
                    builder.addText(sliceItem.mo2051b(), sliceItem.f1658c, sliceItem.mo2048a());
                    break;
                case 5:
                    builder.addInt(sliceItem.mo2055e(), sliceItem.f1658c, sliceItem.mo2048a());
                    break;
                case 6:
                    builder.addLong(sliceItem.mo2057g(), sliceItem.f1658c, sliceItem.mo2048a());
                    break;
            }
        }
        return builder.build();
    }

    /* renamed from: b */
    public static Set m1810b(Set set) {
        C1225nr nrVar = new C1225nr();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                nrVar.add(m1808a((SliceSpec) it.next()));
            }
        }
        return nrVar;
    }

    /* renamed from: a */
    private static SliceSpec m1806a(androidx.slice.SliceSpec sliceSpec) {
        if (sliceSpec != null) {
            return new SliceSpec(sliceSpec.f1670a, sliceSpec.f1671b);
        }
        return null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static androidx.slice.Slice m1807a(Slice slice, Context context) {
        char c;
        if (slice == null || slice.getUri() == null) {
            return null;
        }
        apg apg = new apg(slice.getUri());
        List<String> hints = slice.getHints();
        apg.mo2267a((String[]) hints.toArray(new String[hints.size()]));
        apg.f1925b = m1808a(slice.getSpec());
        for (android.app.slice.SliceItem sliceItem : slice.getItems()) {
            String format = sliceItem.getFormat();
            switch (format.hashCode()) {
                case -1422950858:
                    if (format.equals("action")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (format.equals("int")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3327612:
                    if (format.equals("long")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (format.equals("text")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 100313435:
                    if (format.equals("image")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100358090:
                    if (format.equals("input")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (format.equals("slice")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    apg.mo2264a(m1807a(sliceItem.getSlice(), context), sliceItem.getSubType());
                    break;
                case 1:
                    try {
                        apg.mo2261a(IconCompat.m1174a(context, sliceItem.getIcon()), sliceItem.getSubType(), sliceItem.getHints());
                        break;
                    } catch (IllegalArgumentException e) {
                        Log.w("SliceConvert", "The icon resource isn't available.", e);
                        break;
                    } catch (Resources.NotFoundException e2) {
                        Log.w("SliceConvert", "The icon resource isn't available.", e2);
                        break;
                    }
                case 2:
                    RemoteInput remoteInput = sliceItem.getRemoteInput();
                    String subType = sliceItem.getSubType();
                    List<String> hints2 = sliceItem.getHints();
                    C1244oj.m19766a(remoteInput);
                    C1244oj.m19766a(remoteInput);
                    apg.f1924a.add(new SliceItem(remoteInput, "input", subType, (String[]) hints2.toArray(new String[hints2.size()])));
                    break;
                case 3:
                    apg.mo2260a(sliceItem.getAction(), m1807a(sliceItem.getSlice(), context), sliceItem.getSubType());
                    break;
                case 4:
                    CharSequence text = sliceItem.getText();
                    String subType2 = sliceItem.getSubType();
                    List<String> hints3 = sliceItem.getHints();
                    apg.mo2266a(text, subType2, (String[]) hints3.toArray(new String[hints3.size()]));
                    break;
                case 5:
                    int i = sliceItem.getInt();
                    String subType3 = sliceItem.getSubType();
                    List<String> hints4 = sliceItem.getHints();
                    apg.mo2258a(i, subType3, (String[]) hints4.toArray(new String[hints4.size()]));
                    break;
                case 6:
                    long j = sliceItem.getLong();
                    String subType4 = sliceItem.getSubType();
                    List<String> hints5 = sliceItem.getHints();
                    apg.mo2259a(j, subType4, (String[]) hints5.toArray(new String[hints5.size()]));
                    break;
            }
        }
        return apg.mo2257a();
    }

    /* renamed from: a */
    private static androidx.slice.SliceSpec m1808a(SliceSpec sliceSpec) {
        if (sliceSpec != null) {
            return new androidx.slice.SliceSpec(sliceSpec.getType(), sliceSpec.getRevision());
        }
        return null;
    }

    /* renamed from: a */
    static Set m1809a(Set set) {
        C1225nr nrVar = new C1225nr();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                nrVar.add(m1806a((androidx.slice.SliceSpec) it.next()));
            }
        }
        return nrVar;
    }
}
