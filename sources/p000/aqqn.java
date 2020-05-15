package p000;

import android.provider.ContactsContract;

/* renamed from: aqqn */
public final /* synthetic */ class aqqn implements aqqp {

    /* renamed from: a */
    public static final aqqp f86609a = new aqqn();

    private aqqn() {
    }

    /* renamed from: a */
    public final int mo48079a(int i) {
        int i2;
        Integer num = (Integer) aqqq.f86611a.get(Integer.valueOf(i));
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 7;
        }
        return ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(i2);
    }
}
