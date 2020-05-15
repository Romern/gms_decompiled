package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: cavg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavg implements InvocationHandler {

    /* renamed from: c */
    public static final /* synthetic */ int f176130c = 0;

    /* renamed from: a */
    public boolean f176131a;

    /* renamed from: b */
    public String f176132b;

    /* renamed from: d */
    private final List f176133d;

    public cavg(List list) {
        this.f176133d = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = cavk.f176138b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f176131a = true;
            return null;
        } else if (name.equals("protocols") && objArr.length == 0) {
            return this.f176133d;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f176133d.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f176132b = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f176133d.get(0);
                    this.f176132b = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f176132b = (String) objArr[0];
            return null;
        }
    }
}
