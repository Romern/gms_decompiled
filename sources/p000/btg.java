package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: btg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btg implements bzg {

    /* renamed from: a */
    private final Map f5572a;

    static {
        citv.m151011a(btg.class);
    }

    public btg() {
        HashMap hashMap = new HashMap();
        this.f5572a = hashMap;
        hashMap.put(byy.f6232a, bsi.class);
        this.f5572a.put(bza.f6237a, bza.class);
        this.f5572a.put(bzj.f6250a, bzj.class);
        this.f5572a.put(bzk.f6252a, bzk.class);
        this.f5572a.put(bzl.f6254a, bzl.class);
        this.f5572a.put(bzm.f6256a, bzm.class);
        this.f5572a.put(bzn.f6258a, bzn.class);
        this.f5572a.put(bzq.f6265a, bzq.class);
        this.f5572a.put(bzr.f6267a, bzr.class);
        this.f5572a.put(bsy.f5555a, bsy.class);
        this.f5572a.put(bzs.f6269a, bzs.class);
        this.f5572a.put(bte.f5568a, bte.class);
        this.f5572a.put(bzt.f6271a, bzt.class);
        this.f5572a.put(btf.f5570a, btf.class);
        this.f5572a.put(bzf.f6245a, bzf.class);
        this.f5572a.put(byz.f6234a, byz.class);
        this.f5572a.put(bsz.f5558a, bsz.class);
        this.f5572a.put(btc.f5564a, btc.class);
        this.f5572a.put(brs.f5507a, brs.class);
        this.f5572a.put(brt.f5509a, brt.class);
        this.f5572a.put(bru.f5511a, bru.class);
        this.f5572a.put(brv.f5513a, brv.class);
        this.f5572a.put(brw.f5515a, brw.class);
        this.f5572a.put(brx.f5517a, brx.class);
        this.f5572a.put(bry.f5519a, bry.class);
        this.f5572a.put(brz.f5521a, brz.class);
        this.f5572a.put(bsa.f5524a, bsa.class);
        this.f5572a.put(bsb.f5526a, bsb.class);
        this.f5572a.put(bsc.f5528a, bsc.class);
        this.f5572a.put(bsd.f5530a, bsd.class);
        this.f5572a.put(bse.f5532a, bse.class);
        this.f5572a.put(bsf.f5534a, bsf.class);
        this.f5572a.put(bsg.f5536a, bsg.class);
        this.f5572a.put(bsh.f5538a, bsh.class);
        this.f5572a.put(btc.f5564a, btc.class);
        this.f5572a.put(btd.f5566a, btd.class);
        this.f5572a.put(bta.f5560a, bta.class);
        this.f5572a.put(btb.f5562a, btb.class);
        this.f5572a.put(bsj.f5540b, bsj.class);
        this.f5572a.put(bsk.f5541b, bsk.class);
        this.f5572a.put(bsl.f5542b, bsl.class);
        this.f5572a.put(bsm.f5543b, bsm.class);
        this.f5572a.put(bsn.f5544b, bsn.class);
        this.f5572a.put(bso.f5545b, bso.class);
        this.f5572a.put(bsp.f5546b, bsp.class);
        this.f5572a.put(bsq.f5547b, bsq.class);
        this.f5572a.put(bsr.f5548b, bsr.class);
        this.f5572a.put(bss.f5549b, bss.class);
        this.f5572a.put(bst.f5550b, bst.class);
        this.f5572a.put(bsu.f5551b, bsu.class);
        this.f5572a.put(bsv.f5552b, bsv.class);
        this.f5572a.put(bsw.f5553b, bsw.class);
        this.f5572a.put(bsx.f5554b, bsx.class);
        this.f5572a.put(bzp.f6263a, bzp.class);
        this.f5572a.put(bzi.f6248a, bzi.class);
    }

    /* renamed from: a */
    public final bxg mo3476a() {
        return bxg.EFTPOS;
    }

    /* renamed from: a */
    public final bys mo3477a(bze bze, byte[] bArr) {
        try {
            Class cls = (Class) this.f5572a.get(bze);
            if (cls == null) {
                if (bze.equals(btr.f5578a)) {
                    cls = btr.class;
                } else if (bze.mo3622a()[0] <= 0 || bze.mo3622a()[0] > 20) {
                    String valueOf = String.valueOf(bze);
                    String a = cbm.m3893a(bArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(a).length());
                    sb.append("Unknown dgi ");
                    sb.append(valueOf);
                    sb.append(" data ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                } else {
                    cls = bzh.class;
                }
            }
            citu.m151010a(cls.getSimpleName(), cbm.m3895a(bArr, true));
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
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        } catch (SecurityException e6) {
            throw new RuntimeException(e6);
        }
    }
}
