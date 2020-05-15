package p000;

import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhe {

    /* renamed from: a */
    public final bhh f3223a = new bhh(null);

    /* renamed from: b */
    public bhi f3224b = null;

    /* renamed from: c */
    public int f3225c = 0;

    /* renamed from: a */
    public static final int m3027a(LinkedList linkedList) {
        if (linkedList.size() != 0) {
            return ((Integer) linkedList.getFirst()).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static final List m3031b() {
        return new LinkedList();
    }

    /* renamed from: c */
    public static final Map m3032c() {
        return new TreeMap();
    }

    /* renamed from: a */
    public final int mo3124a() {
        return this.f3223a.f3244o;
    }

    /* renamed from: a */
    public static String m3028a(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                stringBuffer.append("\\f");
            } else if (charAt == 13) {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '/') {
                stringBuffer.append("\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        stringBuffer.append("\\b");
                        continue;
                    case 9:
                        stringBuffer.append("\\t");
                        continue;
                    case 10:
                        stringBuffer.append("\\n");
                        continue;
                    default:
                        if (charAt > 31 && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                            stringBuffer.append(charAt);
                            break;
                        } else {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString.toUpperCase());
                            continue;
                        }
                        break;
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m3029a(Object obj, Writer writer) {
        if (obj == null) {
            writer.write("null");
        } else if (obj instanceof String) {
            writer.write(34);
            writer.write(m3028a((String) obj));
            writer.write(34);
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Number) {
            writer.write(obj.toString());
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof Map) {
            m3030a((Map) obj, writer);
        } else if (obj instanceof Collection) {
            m3029a((Collection) obj, writer);
        } else if (obj instanceof byte[]) {
            m3029a((byte[]) obj, writer);
        } else if (obj instanceof short[]) {
            m3029a((short[]) obj, writer);
        } else if (obj instanceof int[]) {
            m3029a((int[]) obj, writer);
        } else if (obj instanceof long[]) {
            m3029a((long[]) obj, writer);
        } else if (obj instanceof float[]) {
            m3029a((float[]) obj, writer);
        } else if (obj instanceof double[]) {
            m3029a((double[]) obj, writer);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr.length == 0) {
                writer.write("[]");
                return;
            }
            writer.write("[");
            writer.write(String.valueOf(zArr[0]));
            for (int i = 1; i < zArr.length; i++) {
                writer.write(",");
                writer.write(String.valueOf(zArr[i]));
            }
            writer.write("]");
        } else if (obj instanceof char[]) {
            m3029a((char[]) obj, writer);
        } else if (obj instanceof Object[]) {
            m3029a((Object[]) obj, writer);
        } else if (obj instanceof bia) {
            writer.write(34);
            writer.write(m3028a(obj.toString()));
            writer.write(34);
        } else {
            writer.write(obj.toString());
        }
    }

    /* renamed from: a */
    public static void m3030a(Map map, Writer writer) {
        if (map != null) {
            writer.write(123);
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                if (!z) {
                    writer.write(44);
                }
                writer.write(34);
                writer.write(m3028a(String.valueOf(entry.getKey())));
                writer.write(34);
                writer.write(58);
                m3029a(entry.getValue(), writer);
                z = false;
            }
            writer.write(125);
            return;
        }
        writer.write("null");
    }
}
