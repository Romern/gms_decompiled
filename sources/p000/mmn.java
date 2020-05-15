package p000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: mmn */
final /* synthetic */ class mmn implements mmr {

    /* renamed from: a */
    private final mmo f34013a;

    /* renamed from: b */
    private final mph f34014b;

    public mmn(mmo mmo, mph mph) {
        this.f34013a = mmo;
        this.f34014b = mph;
    }

    /* renamed from: a */
    public final InputStream mo20161a() {
        mmo mmo = this.f34013a;
        mph mph = this.f34014b;
        mmo.mo20170b();
        if (!mmo.f34016a.contains(mph.f34146d)) {
            String valueOf = String.valueOf(mph.f34146d);
            throw new C1577mms(valueOf.length() == 0 ? new String("Item not advertised by the source: ") : "Item not advertised by the source: ".concat(valueOf));
        }
        try {
            return new FileInputStream(mmo.m25342b(mph));
        } catch (FileNotFoundException e) {
            String valueOf2 = String.valueOf(mph.f34146d);
            throw new C1577mms(valueOf2.length() == 0 ? new String("File not found: ") : "File not found: ".concat(valueOf2));
        }
    }
}
