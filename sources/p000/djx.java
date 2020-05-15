package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import java.lang.reflect.Constructor;
import java.util.Map;

/* renamed from: djx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djx {

    /* renamed from: a */
    private static final Object[] f13372a = new Object[2];

    /* renamed from: b */
    private static final Class[] f13373b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final Map f13374c = new C1223np();

    /* JADX WARN: Failed to insert an additional move for type inference into block B:7:0x002e */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:9:0x0038 */
    /* JADX WARN: Type inference failed for: r8v9, assign insn: PHI: (r8v9 ?) = (r8v0 java.lang.ClassLoader), (r8v20 ?) binds: [B:7:0x002e, B:9:0x0038] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Class], assign insn: 0x0034: INVOKE  (r8v20 ? I:java.lang.Class) = (r8v19 java.lang.Class), (wrap: java.lang.Class : 0x0032: CONST_CLASS   android.view.View.class) type: VIRTUAL call: java.lang.Class.asSubclass(java.lang.Class):java.lang.Class */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        r9 = e;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r8 = r8.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r8 = "<unknown>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        android.util.Log.e("ChimeraViewCreator", "Error attempting to create  view", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        r8 = p000.djx.f13372a;
        r8[0] = null;
        r8[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r11 = r11.getPositionDescription();
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r11).length() + 22) + java.lang.String.valueOf(r10).length());
        r2.append(r11);
        r2.append(": Class is not a View ");
        r2.append(r10);
        r9 = new android.view.InflateException(r2.toString());
        r9.initCause(r8);
        android.util.Log.e("ChimeraViewCreator", "Error attempting to create  view", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        r8 = p000.djx.f13372a;
        r8[0] = null;
        r8[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r11 = r11.getPositionDescription();
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r11).length() + 24) + java.lang.String.valueOf(r10).length());
        r2.append(r11);
        r2.append(": Error inflating class ");
        r2.append(r10);
        r9 = new android.view.InflateException(r2.toString());
        r9.initCause(r8);
        android.util.Log.e("ChimeraViewCreator", "Error attempting to create  view", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013d, code lost:
        r8 = p000.djx.f13372a;
        r8[0] = null;
        r8[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0144, code lost:
        r9 = p000.djx.f13372a;
        r9[0] = null;
        r9[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.ClassLoader, code=?, for r8v0, types: [java.lang.Object, java.lang.ClassLoader], assign insn: null */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }, ExcHandler: ClassNotFoundException (r8v14 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE, Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }]), Splitter:B:7:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }, ExcHandler: ClassCastException (r8v12 'e' java.lang.ClassCastException A[CUSTOM_DECLARE, Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }]), Splitter:B:7:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }, ExcHandler: NoSuchMethodException (r8v10 'e' java.lang.NoSuchMethodException A[CUSTOM_DECLARE, Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }]), Splitter:B:7:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085 A[Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[Catch:{ NoSuchMethodException -> 0x0052, ClassCastException -> 0x004f, ClassNotFoundException -> 0x004c, Exception -> 0x007c, all -> 0x0045 }] */
    /* renamed from: a */
    public static final View m8679a(ClassLoader r8, Context context, String str, AttributeSet attributeSet) {
        String str2;
        if (str.indexOf(".") == -1) {
            return null;
        }
        Map map = (Map) f13374c.get(r8);
        if (map == null) {
            map = new C1223np();
            f13374c.put(r8, map);
        }
        Constructor constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                r8 = r8.loadClass(str).asSubclass(View.class);
                constructor = r8.getConstructor(f13373b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            } catch (NoSuchMethodException e) {
            } catch (ClassCastException e2) {
            } catch (ClassNotFoundException e3) {
            } catch (Exception e4) {
                e = e4;
                Class cls = null;
                String positionDescription = attributeSet.getPositionDescription();
                if (cls == null) {
                }
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 24 + String.valueOf(str2).length());
                sb.append(positionDescription);
                sb.append(": Error inflating class ");
                sb.append(str2);
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                Log.e("ChimeraViewCreator", "Error attempting to create  view", inflateException);
                Object[] objArr = f13372a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
        }
        f13372a[0] = context;
        f13372a[1] = attributeSet;
        View view = (View) constructor.newInstance(f13372a);
        if (view instanceof ViewStub) {
            ((ViewStub) view).setLayoutInflater(LayoutInflater.from(context));
        }
        Object[] objArr2 = f13372a;
        objArr2[0] = null;
        objArr2[1] = null;
        return view;
    }
}
