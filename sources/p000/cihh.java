package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: cihh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihh implements InvocationHandler {

    /* renamed from: c */
    public static final /* synthetic */ int f190301c = 0;

    /* renamed from: a */
    public boolean f190302a;

    /* renamed from: b */
    public String f190303b;

    /* renamed from: d */
    private final List f190304d;

    public cihh(List list) {
        this.f190304d = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = cihl.f190321a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f190302a = true;
            return null;
        } else if (name.equals("protocols") && objArr.length == 0) {
            return this.f190304d;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f190304d.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f190303b = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f190304d.get(0);
                    this.f190303b = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f190303b = (String) objArr[0];
            return null;
        }
    }
}
