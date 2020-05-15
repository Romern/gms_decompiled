package p000;

import android.database.Cursor;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adpi extends cazu {

    /* renamed from: b */
    private final cazn f62444b;

    /* renamed from: c */
    private final cazn f62445c;

    /* renamed from: d */
    private final cazn f62446d;

    /* renamed from: e */
    private final cazn f62447e;

    /* renamed from: f */
    private final cazn f62448f;

    public adpi(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3, cazn cazn4, cazn cazn5) {
        super(cijl2, cbag.m127657a(adpi.class), cijl);
        this.f62444b = cbac.m127643a(cazn);
        this.f62445c = cbac.m127643a(cazn2);
        this.f62446d = cbac.m127643a(cazn3);
        this.f62447e = cbac.m127643a(cazn4);
        this.f62448f = cbac.m127643a(cazn5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62444b.mo75201b(), this.f62445c.mo75201b(), this.f62446d.mo75201b(), this.f62447e.mo75201b(), this.f62448f.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        bqgg a;
        List list = (List) obj;
        Cursor cursor = (Cursor) list.get(0);
        Cursor cursor2 = (Cursor) list.get(1);
        brhj brhj = (brhj) list.get(2);
        Executor executor = (Executor) list.get(3);
        adsi adsi = (adsi) list.get(4);
        if (cursor == null || cursor2 == null) {
            return bqga.m112775a((Object) false);
        }
        adqo adqo = new adqo(4);
        adqo.mo33712c();
        try {
            if (cursor.isClosed()) {
                a = bqga.m112775a((Object) true);
            } else {
                if (!cursor2.isClosed()) {
                    if (cursor.getCount() != 0 || cursor2.getCount() != 0) {
                        int columnIndex = cursor2.getColumnIndex("_ID");
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor2.getColumnIndex("MEDIA_TYPE");
                        adrj adrj = new adrj(brhj, executor, adsi, adqo);
                        if (cursor.getCount() != 0 || cursor2.getCount() <= 0) {
                            if (cursor.getCount() > 0) {
                                cursor2.getCount();
                            }
                            cursor.moveToFirst();
                            cursor2.moveToFirst();
                            while (true) {
                                if (cursor.isAfterLast() || cursor2.isAfterLast()) {
                                    break;
                                }
                                long j = cursor.getLong(columnIndex2);
                                long j2 = cursor2.getLong(columnIndex);
                                adqz adqz = new adqz(Long.valueOf(j2), Integer.valueOf(cursor2.getInt(columnIndex3)));
                                if (j == j2) {
                                    cursor.moveToNext();
                                    cursor2.moveToNext();
                                } else if (j < j2) {
                                    adrj.mo33741a(adqz);
                                    cursor2.moveToNext();
                                } else {
                                    cursor.moveToNext();
                                }
                                if (cursor.isAfterLast()) {
                                    if (!cursor2.isAfterLast()) {
                                        adph.m50934a(cursor2, columnIndex, columnIndex3, adrj);
                                        break;
                                    }
                                }
                                if (!cursor.isAfterLast() && cursor2.isAfterLast()) {
                                    break;
                                }
                            }
                            a = adrj.mo33739a();
                        } else {
                            cursor2.moveToFirst();
                            adph.m50934a(cursor2, columnIndex, columnIndex3, adrj);
                            a = adrj.mo33739a();
                        }
                    }
                }
                a = bqga.m112775a((Object) true);
            }
            cursor2.close();
            cursor.close();
            return a;
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
