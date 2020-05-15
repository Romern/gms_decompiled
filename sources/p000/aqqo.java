package p000;

import android.provider.ContactsContract;

/* renamed from: aqqo */
public final /* synthetic */ class aqqo implements aqqp {

    /* renamed from: a */
    public static final aqqp f86610a = new aqqo();

    private aqqo() {
    }

    /* renamed from: a */
    public final int mo48079a(int i) {
        int i2;
        Integer num = (Integer) aqqq.f86612b.get(Integer.valueOf(i));
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 3;
        }
        return ContactsContract.CommonDataKinds.Email.getTypeLabelResource(i2);
    }
}
