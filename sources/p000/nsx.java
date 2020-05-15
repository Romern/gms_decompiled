package p000;

import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.TouchEventCompleteData;
import java.lang.ref.WeakReference;

/* renamed from: nsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nsx extends dck implements nsy {

    /* renamed from: a */
    private final WeakReference f36429a;

    public nsx() {
        super("com.google.android.gms.car.ICarWindow");
    }

    /* renamed from: a */
    private final String m27633a() {
        oog oog = (oog) this.f36429a.get();
        return oog == null ? "(null)" : oog.mo21456a();
    }

    /* renamed from: a */
    private final void m27634a(TouchEventCompleteData touchEventCompleteData) {
        oop oop = (oop) this.f36429a.get();
        if (oop != null) {
            nuu.m27792a(new ook(oop, touchEventCompleteData));
        }
    }

    public nsx(oop oop) {
        super("com.google.android.gms.car.ICarWindow");
        this.f36429a = new WeakReference(oop);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                bnsn bnsn = oop.f38074a;
                m27633a();
                oop oop = (oop) this.f36429a.get();
                if (oop != null) {
                    oop.getClass();
                    nuu.m27792a(new ooj(oop));
                    break;
                }
                break;
            case 2:
                int readInt = parcel.readInt();
                bnsn bnsn2 = oop.f38074a;
                m27633a();
                m27634a(new TouchEventCompleteData(readInt, null, -1));
                break;
            case 3:
                boolean a = dcl.m8167a(parcel);
                bnsn bnsn3 = oop.f38074a;
                m27633a();
                oop oop2 = (oop) this.f36429a.get();
                if (oop2 != null) {
                    nuu.m27792a(new ool(oop2, a));
                    break;
                }
                break;
            case 4:
                bnsn bnsn4 = oop.f38074a;
                m27633a();
                oop oop3 = (oop) this.f36429a.get();
                if (oop3 != null) {
                    oop3.getClass();
                    nuu.m27792a(new oom(oop3));
                    break;
                }
                break;
            case 5:
                bnsn bnsn5 = oop.f38074a;
                m27633a();
                oop oop4 = (oop) this.f36429a.get();
                if (oop4 != null) {
                    oop4.f38081h.mo22459x();
                    break;
                }
                break;
            case 6:
                bnsn bnsn6 = oop.f38074a;
                m27633a();
                m27634a((TouchEventCompleteData) dcl.m8163a(parcel, TouchEventCompleteData.CREATOR));
                break;
            case 7:
                CarWindowLayoutParams carWindowLayoutParams = (CarWindowLayoutParams) dcl.m8163a(parcel, CarWindowLayoutParams.CREATOR);
                bnsn bnsn7 = oop.f38074a;
                m27633a();
                oop oop5 = (oop) this.f36429a.get();
                if (oop5 != null) {
                    oop5.f38080g = carWindowLayoutParams;
                    ooq o = oop5.f38077d.mo21702o();
                    bmxy.m108581a(o);
                    Rect b = oop5.mo22400b(o);
                    oos oos = oop5.f38081h;
                    int i2 = b.left;
                    int i3 = o.f38097g;
                    int i4 = b.bottom;
                    int width = b.width();
                    int height = b.height();
                    Integer num = (Integer) oqa.f38227ad.get(4);
                    bmxy.m108581a(num);
                    int intValue = num.intValue();
                    CarWindowLayoutParams carWindowLayoutParams2 = oop5.f38080g;
                    oos.mo22417a(i2, i3 - i4, width, height, intValue, carWindowLayoutParams2.f29387i, oop5.f38082i, oop5.f38083j, carWindowLayoutParams2.f29392n);
                    break;
                }
                break;
            case 8:
                if (cctl.m131527e()) {
                    bnsn bnsn8 = oop.f38074a;
                    m27633a();
                    oop oop6 = (oop) this.f36429a.get();
                    if (oop6 != null) {
                        oop6.getClass();
                        nuu.m27792a(new oon(oop6));
                        break;
                    }
                } else {
                    throw new IllegalStateException(String.format("Binder:%s.requestFocus() failed because flag not enabled", m27633a()));
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
