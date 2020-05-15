package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: bxxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxe {
    /* renamed from: a */
    private static final String m124168a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m124169a(bxxc bxxc, StringBuilder sb, int i) {
        String str;
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = bxxc.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                String str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m124170a(sb, i, m124168a(str3), bxvk.m124023a(method2, bxxc, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                String str4 = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m124170a(sb, i, m124168a(str4), bxvk.m124023a(method3, bxxc, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(str);
            if (((Method) hashMap2.get(valueOf5.length() == 0 ? new String("set") : "set".concat(valueOf5))) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(str.substring(0, str.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() == 0 ? new String("get") : "get".concat(valueOf6))) {
                    }
                }
                String valueOf7 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(str.substring(1));
                String str5 = valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
                String valueOf9 = String.valueOf(str);
                Method method4 = (Method) hashMap.get(valueOf9.length() == 0 ? new String("get") : "get".concat(valueOf9));
                String valueOf10 = String.valueOf(str);
                Method method5 = (Method) hashMap.get(valueOf10.length() == 0 ? new String("has") : "has".concat(valueOf10));
                if (method4 != null) {
                    Object a = bxvk.m124023a(method4, bxxc, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) bxvk.m124023a(method5, bxxc, new Object[0])).booleanValue()) {
                        }
                    } else if (a instanceof Boolean) {
                        if (!((Boolean) a).booleanValue()) {
                        }
                    } else if (a instanceof Integer) {
                        if (((Integer) a).intValue() == 0) {
                        }
                    } else if (a instanceof Float) {
                        if (((Float) a).floatValue() == 0.0f) {
                        }
                    } else if (!(a instanceof Double)) {
                        if (a instanceof String) {
                            z = a.equals("");
                        } else if (a instanceof bxtx) {
                            z = a.equals(bxtx.f164797b);
                        } else if (a instanceof bxxc) {
                            if (a == ((bxxc) a).mo74067j()) {
                            }
                        } else if ((a instanceof Enum) && ((Enum) a).ordinal() == 0) {
                        }
                        if (z) {
                        }
                    } else if (((Double) a).doubleValue() == 0.0d) {
                    }
                    m124170a(sb, i, m124168a(str5), a);
                }
            }
        }
        if (bxxc instanceof bxvg) {
            Iterator d = ((bxvg) bxxc).f164952m.mo73917d();
            while (d.hasNext()) {
                Map.Entry entry = (Map.Entry) d.next();
                int i2 = ((bxvi) entry.getKey()).f164953a;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                m124170a(sb, i, sb2.toString(), entry.getValue());
            }
        }
        bxyo bxyo = ((bxvk) bxxc).f164960ah;
        if (bxyo != null) {
            for (int i3 = 0; i3 < bxyo.f165103b; i3++) {
                m124170a(sb, i, String.valueOf(bxzh.m124563b(bxyo.f165104c[i3])), bxyo.f165105d[i3]);
            }
        }
    }

    /* renamed from: a */
    static final void m124170a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m124170a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m124170a(sb, i, str, entry);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(bxyj.m124411a(bxtx.m123258a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof bxtx) {
                sb.append(": \"");
                sb.append(bxyj.m124411a((bxtx) obj));
                sb.append('\"');
            } else if (obj instanceof bxvk) {
                sb.append(" {");
                m124169a((bxvk) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m124170a(sb, i4, "key", entry2.getKey());
                m124170a(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }
}
