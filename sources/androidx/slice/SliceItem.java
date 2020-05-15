package androidx.slice;

import android.app.PendingIntent;
import android.graphics.Color;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.text.Spannable;
import android.text.format.DateUtils;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SliceItem extends CustomVersionedParcelable {

    /* renamed from: a */
    protected String[] f1656a;

    /* renamed from: b */
    public String f1657b;

    /* renamed from: c */
    public String f1658c;

    /* renamed from: d */
    public Object f1659d;

    /* renamed from: e */
    public CharSequence f1660e;

    /* renamed from: f */
    SliceItemHolder f1661f;

    public SliceItem() {
        this.f1656a = Slice.f1650a;
        this.f1657b = "text";
        this.f1658c = null;
    }

    /* renamed from: a */
    public static void m1637a(Spannable spannable) {
        Object obj;
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        for (Object obj2 : spans) {
            if (!m1638a(obj2)) {
                obj = null;
            } else {
                obj = obj2;
            }
            if (obj != obj2) {
                if (obj != null) {
                    spannable.setSpan(obj, spannable.getSpanStart(obj2), spannable.getSpanEnd(obj2), spannable.getSpanFlags(obj2));
                }
                spannable.removeSpan(obj2);
            }
        }
    }

    /* renamed from: b */
    public final CharSequence mo2051b() {
        return (CharSequence) this.f1659d;
    }

    /* renamed from: c */
    public final IconCompat mo2053c() {
        return (IconCompat) this.f1659d;
    }

    /* renamed from: d */
    public final PendingIntent mo2054d() {
        Object obj = ((C1240of) this.f1659d).f26798a;
        if (obj instanceof PendingIntent) {
            return (PendingIntent) obj;
        }
        return null;
    }

    /* renamed from: e */
    public final int mo2055e() {
        return ((Integer) this.f1659d).intValue();
    }

    /* renamed from: f */
    public final Slice mo2056f() {
        if ("action".equals(this.f1657b)) {
            return (Slice) ((C1240of) this.f1659d).f26799b;
        }
        return (Slice) this.f1659d;
    }

    /* renamed from: g */
    public final long mo2057g() {
        return ((Long) this.f1659d).longValue();
    }

    public final String toString() {
        return mo2052b("");
    }

    public SliceItem(Object obj, String str, String str2, String[] strArr) {
        this.f1656a = strArr;
        this.f1657b = str;
        this.f1658c = str2;
        this.f1659d = obj;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00de, code lost:
        if (r4.equals("action") != false) goto L_0x00e2;
     */
    /* renamed from: b */
    public final String mo2052b(String str) {
        char c;
        String str2;
        String str3;
        String str4 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(this.f1657b);
        if (this.f1658c != null) {
            sb.append('<');
            sb.append(this.f1658c);
            sb.append('>');
        }
        sb.append(' ');
        String[] strArr = this.f1656a;
        if (strArr.length > 0) {
            Slice.m1631a(sb, strArr);
            sb.append(' ');
        }
        String str5 = str4 + "  ";
        String str6 = this.f1657b;
        char c2 = 3;
        switch (str6.hashCode()) {
            case -1422950858:
                if (str6.equals("action")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 104431:
                if (str6.equals("int")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3327612:
                if (str6.equals("long")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (str6.equals("text")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str6.equals("image")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 109526418:
                if (str6.equals("slice")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            sb.append("{\n");
            sb.append(mo2056f().mo2044a(str5));
            sb.append(10);
            sb.append(str4);
            sb.append('}');
        } else if (c == 1) {
            Object obj = ((C1240of) this.f1659d).f26798a;
            sb.append('[');
            sb.append(obj);
            sb.append("] {\n");
            sb.append(mo2056f().mo2044a(str5));
            sb.append(10);
            sb.append(str4);
            sb.append('}');
        } else if (c == 2) {
            sb.append('\"');
            sb.append(mo2051b());
            sb.append('\"');
        } else if (c == 3) {
            sb.append(mo2053c());
        } else if (c != 4) {
            if (c != 5) {
                switch (str6.hashCode()) {
                    case -1422950858:
                        break;
                    case 104431:
                        if (str6.equals("int")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3327612:
                        if (str6.equals("long")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3556653:
                        if (str6.equals("text")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 100313435:
                        if (str6.equals("image")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 100358090:
                        if (str6.equals("input")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 109526418:
                        if (str6.equals("slice")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        str3 = "Slice";
                        break;
                    case 1:
                        str3 = "Text";
                        break;
                    case 2:
                        str3 = "Image";
                        break;
                    case 3:
                        str3 = "Action";
                        break;
                    case 4:
                        str3 = "Int";
                        break;
                    case 5:
                        str3 = "Long";
                        break;
                    case 6:
                        str3 = "RemoteInput";
                        break;
                    default:
                        str3 = "Unrecognized format: " + str6;
                        break;
                }
                sb.append(str3);
            } else if (!"millis".equals(this.f1658c)) {
                sb.append(mo2057g());
                sb.append('L');
            } else if (mo2057g() == -1) {
                sb.append("INFINITY");
            } else {
                sb.append(DateUtils.getRelativeTimeSpanString(mo2057g(), Calendar.getInstance().getTimeInMillis(), 1000, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE));
            }
        } else if ("color".equals(this.f1658c)) {
            int e = mo2055e();
            sb.append(String.format("a=0x%02x r=0x%02x g=0x%02x b=0x%02x", Integer.valueOf(Color.alpha(e)), Integer.valueOf(Color.red(e)), Integer.valueOf(Color.green(e)), Integer.valueOf(Color.blue(e))));
        } else if ("layout_direction".equals(this.f1658c)) {
            int e2 = mo2055e();
            if (e2 != 0) {
                str2 = e2 != 1 ? e2 != 2 ? e2 != 3 ? Integer.toString(e2) : "LOCALE" : "INHERIT" : "RTL";
            } else {
                str2 = "LTR";
            }
            sb.append(str2);
        } else {
            sb.append(mo2055e());
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m1638a(Object obj) {
        return (obj instanceof AlignmentSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof StyleSpan);
    }

    /* renamed from: a */
    public final List mo2048a() {
        return Arrays.asList(this.f1656a);
    }

    /* renamed from: a */
    public final boolean mo2049a(String str) {
        return apf.m1792a(this.f1656a, str);
    }

    /* renamed from: a */
    public final boolean mo2050a(String... strArr) {
        for (String str : strArr) {
            if (apf.m1792a(this.f1656a, str)) {
                return true;
            }
        }
        return false;
    }
}
