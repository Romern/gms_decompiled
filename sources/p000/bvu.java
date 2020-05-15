package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvu implements bzg {

    /* renamed from: a */
    private final Map f5815a;

    public bvu() {
        HashMap hashMap = new HashMap();
        this.f5815a = hashMap;
        hashMap.put(byy.f6232a, byy.class);
        this.f5815a.put(bvd.f5782a, bvd.class);
        this.f5815a.put(bvf.f5786a, bvf.class);
        this.f5815a.put(bza.f6237a, bza.class);
        this.f5815a.put(bvi.f5792a, bvi.class);
        this.f5815a.put(bvo.f5804a, bvo.class);
        this.f5815a.put(bvs.f5812a, bvs.class);
        this.f5815a.put(byu.f6230b, bvt.class);
        this.f5815a.put(bzf.f6245a, bzf.class);
        this.f5815a.put(byz.f6234a, byz.class);
        this.f5815a.put(bzb.f6239a, bzb.class);
        this.f5815a.put(bvb.f5778a, bvb.class);
        this.f5815a.put(bvc.f5780a, bvc.class);
        this.f5815a.put(bvh.f5790a, bvh.class);
        this.f5815a.put(bve.f5784a, bve.class);
        this.f5815a.put(bvg.f5788a, bvg.class);
        this.f5815a.put(bvr.f5810a, bvr.class);
        this.f5815a.put(bvq.f5808a, bvq.class);
        this.f5815a.put(bvj.f5794a, bvj.class);
        this.f5815a.put(bvk.f5796a, bvk.class);
        this.f5815a.put(bvm.f5800a, bvm.class);
        this.f5815a.put(bvn.f5802a, bvn.class);
        this.f5815a.put(bvp.f5806a, bvp.class);
        this.f5815a.put(bvl.f5798a, bvl.class);
        this.f5815a.put(bvv.f5816a, bvv.class);
    }

    /* renamed from: a */
    public final bxg mo3476a() {
        return bxg.INTERAC_FLASH;
    }

    /* renamed from: a */
    public final bys mo3477a(bze bze, byte[] bArr) {
        try {
            Class cls = (Class) this.f5815a.get(bze);
            if (cls == null) {
                if (bze.equals(btr.f5578a)) {
                    cls = btr.class;
                } else if (bze.equals(bzo.f6260a)) {
                    cls = bzo.class;
                } else {
                    String valueOf = String.valueOf(bze);
                    String a = cbm.m3893a(bArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(a).length());
                    sb.append("Unknown dgi ");
                    sb.append(valueOf);
                    sb.append(" data ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (!cls.equals(bzo.class)) {
                Constructor constructor = cls.getConstructor(bze.class, byte[].class);
                if (constructor != null) {
                    return (bys) constructor.newInstance(bze, bArr);
                }
                String simpleName = cls.getSimpleName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName).length() + 54);
                sb2.append("Dgi class ");
                sb2.append(simpleName);
                sb2.append(" does not implement the expected constructor");
                throw new IllegalStateException(sb2.toString());
            }
            Constructor constructor2 = cls.getConstructor(bze.class, byte[].class, bzg.class);
            if (constructor2 != null) {
                return (bys) constructor2.newInstance(bze, bArr, this);
            }
            String simpleName2 = cls.getSimpleName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(simpleName2).length() + 54);
            sb3.append("Dgi class ");
            sb3.append(simpleName2);
            sb3.append(" does not implement the expected constructor");
            throw new IllegalStateException(sb3.toString());
        } catch (InstantiationException e) {
            String valueOf2 = String.valueOf(bze);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 22);
            sb4.append("Failed to process DGI ");
            sb4.append(valueOf2);
            throw new RuntimeException(sb4.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf3 = String.valueOf(bze);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
            sb5.append("Failed to process DGI ");
            sb5.append(valueOf3);
            throw new RuntimeException(sb5.toString(), e2);
        } catch (IllegalArgumentException e3) {
            String valueOf4 = String.valueOf(bze);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 22);
            sb6.append("Failed to process DGI ");
            sb6.append(valueOf4);
            throw new RuntimeException(sb6.toString(), e3);
        } catch (InvocationTargetException e4) {
            String valueOf5 = String.valueOf(bze);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
            sb7.append("Failed to process DGI ");
            sb7.append(valueOf5);
            throw new RuntimeException(sb7.toString(), e4);
        } catch (NoSuchMethodException e5) {
            String valueOf6 = String.valueOf(bze);
            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf6).length() + 22);
            sb8.append("Failed to process DGI ");
            sb8.append(valueOf6);
            throw new RuntimeException(sb8.toString(), e5);
        } catch (SecurityException e6) {
            String valueOf7 = String.valueOf(bze);
            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf7).length() + 22);
            sb9.append("Failed to process DGI ");
            sb9.append(valueOf7);
            throw new RuntimeException(sb9.toString(), e6);
        }
    }
}
