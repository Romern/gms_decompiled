package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhr extends azhc {

    /* renamed from: b */
    private final azbx f99414b;

    /* renamed from: c */
    private final aznz f99415c;

    /* renamed from: d */
    private final azfo f99416d;

    /* renamed from: e */
    private final Intent f99417e;

    /* renamed from: f */
    private SQLiteDatabase f99418f;

    /* renamed from: g */
    private List f99419g;

    /* renamed from: h */
    private int f99420h;

    /* renamed from: i */
    private int f99421i;

    /* renamed from: j */
    private final azcv f99422j;

    /* renamed from: k */
    private final LocalEntityId f99423k;

    /* renamed from: l */
    private azcs f99424l;

    /* renamed from: m */
    private final int f99425m;

    public azhr(Context context, azfx azfx, String str, int i, Intent intent, azfo azfo, azcl azcl, azbx azbx, azcv azcv) {
        super(context, azfx, "Send message receipt");
        this.f99415c = aznz.m85891a(str);
        this.f99425m = i;
        this.f99417e = intent;
        try {
            this.f99418f = azcl.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f99418f = null;
        }
        this.f99416d = azfo;
        this.f99414b = azbx;
        this.f99422j = azcv;
        this.f99423k = this.f99415c.f99780g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        return ((afja) azht.m85748a(this.f99339a).mo54933a(4)).mo34895a(azht.m85748a(this.f99339a).mo54932a(4, this.f99423k), (cbgt) obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[LOOP:1: B:41:0x00ee->B:42:0x00f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        int i;
        int size;
        int i2;
        boolean z;
        cbmh cbmh;
        cbmh cbmh2;
        if (this.f99415c == null || this.f99418f == null) {
            return null;
        }
        int i3 = this.f99425m;
        int i4 = 4;
        if (i3 != 3) {
            i3 = 4;
        }
        bmxy.m108588a(true);
        if (i3 - 2 != 1) {
            i = 3;
        } else {
            i = 1;
        }
        this.f99420h = i;
        int i5 = this.f99425m;
        if (i5 != 3) {
            i5 = 4;
        }
        bmxy.m108588a(true);
        if (i5 - 2 == 1) {
            i4 = 2;
        }
        this.f99421i = i4;
        azcm a = azcm.m85300a(this.f99339a);
        int i6 = this.f99420h;
        String str = this.f99415c.f99774a;
        ArrayList arrayList = new ArrayList();
        if (!a.mo54651a()) {
            a.f98996b = azcl.m85289a(a.f98995a).getReadableDatabase();
        }
        Cursor query = a.f98996b.query("messages", new String[]{"message_id", "server_timestamp_ms", "error_code"}, "conversation_id = ? AND status = ?", new String[]{str, Integer.toString(i6)}, null, null, null);
        if (query == null || !query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            this.f99419g = new ArrayList();
            size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                this.f99419g.add(((cbmg) arrayList.get(i2)).f177618a);
            }
            if (this.f99419g.size() != 0) {
                return null;
            }
            if (this.f99415c.mo55108f() || cfeo.m138873d()) {
                azcs a2 = this.f99422j.mo54689a(this.f99423k);
                this.f99424l = a2;
                byte[] bArr = a2 != null ? a2.f99002a : null;
                aznz aznz = this.f99415c;
                int i7 = this.f99425m;
                ArrayList arrayList2 = new ArrayList();
                bxvd da = cbil.f177257h.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cbil) da.f164949b).f177261c = cbik.m127887a(7);
                bxvd da2 = cbmh.f177621c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((cbmh) da2.f164949b).f177623a = i7 - 2;
                cbmh cbmh3 = (cbmh) da2.f164949b;
                if (!cbmh3.f177624b.mo73666a()) {
                    cbmh3.f177624b = bxvk.m124021a(cbmh3.f177624b);
                }
                bxsy.m123078a(arrayList, cbmh3.f177624b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbil cbil = (cbil) da.f164949b;
                cbmh cbmh4 = (cbmh) da2.mo74062i();
                cbmh4.getClass();
                cbil.f177260b = cbmh4;
                cbil.f177259a = 3;
                arrayList2.add((cbil) da.mo74062i());
                LocalEntityId localEntityId = aznz.f99780g;
                bxvd a3 = azho.m85725a("SendMessageReceiptH", this.f99418f, bArr, aznz, azfn.m85576a(), azfn.m85572a(arrayList2, aznz, LocalEntityId.m94548a(localEntityId.f111074a, localEntityId.f111075b, localEntityId.f111076c)));
                cbij cbij = ((cbgt) a3.f164949b).f177087d;
                if (cbij == null) {
                    cbij = cbij.f177251e;
                }
                if (cbij.f177253a.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108588a(z);
                if (this.f99415c.mo55106d()) {
                    cbgt cbgt = (cbgt) a3.mo74062i();
                    cbij cbij2 = cbgt.f177087d;
                    if (cbij2 != null && cbij2.f177253a.size() <= 0) {
                        cbij cbij3 = cbgt.f177087d;
                        if (cbij3 == null) {
                            cbij3 = cbij.f177251e;
                        }
                        cbil cbil2 = (cbil) cbij3.f177253a.get(0);
                        if (cbil2.f177259a == 3) {
                            cbmh = (cbmh) cbil2.f177260b;
                        } else {
                            cbmh = cbmh.f177621c;
                        }
                        if (cbmh.f177624b.size() != 0) {
                            cbij cbij4 = cbgt.f177087d;
                            if (cbij4 == null) {
                                cbij4 = cbij.f177251e;
                            }
                            cbil cbil3 = (cbil) cbij4.f177253a.get(0);
                            if (cbil3.f177259a == 3) {
                                cbmh2 = (cbmh) cbil3.f177260b;
                            } else {
                                cbmh2 = cbmh.f177621c;
                            }
                            bxwc bxwc = cbmh2.f177624b;
                            int size2 = bxwc.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    break;
                                }
                                int i9 = i8 + 1;
                                if (((cbmg) bxwc.get(i8)).f177620c == 2) {
                                    break;
                                }
                                i8 = i9;
                            }
                        }
                    }
                    azbx azbx = this.f99414b;
                    aznz aznz2 = this.f99415c;
                    cbij cbij5 = ((cbgt) a3.f164949b).f177087d;
                    if (cbij5 == null) {
                        cbij5 = cbij.f177251e;
                    }
                    cbil a4 = azbx.mo54582a(aznz2, (cbil) cbij5.f177253a.get(0));
                    if (a4 == null) {
                        azph.m85998a(this.f99339a).mo55170c(126, 32);
                        azoj.m85933c("SendMessageReceiptH", "Failed to encrypt message receipt", new Object[0]);
                        return null;
                    }
                    cbij cbij6 = ((cbgt) a3.f164949b).f177087d;
                    if (cbij6 == null) {
                        cbij6 = cbij.f177251e;
                    }
                    bxvd bxvd = (bxvd) cbij6.mo74142c(5);
                    bxvd.mo73625a((bxvk) cbij6);
                    cbii cbii = (cbii) bxvd;
                    if (cbii.f164950c) {
                        cbii.mo74035c();
                        cbii.f164950c = false;
                    }
                    cbij cbij7 = (cbij) cbii.f164949b;
                    a4.getClass();
                    cbij7.mo75235c();
                    cbij7.f177253a.set(0, a4);
                    if (a3.f164950c) {
                        a3.mo74035c();
                        a3.f164950c = false;
                    }
                    cbij cbij8 = (cbij) cbii.mo74062i();
                    cbgt cbgt2 = cbgt.f177082e;
                    cbij8.getClass();
                    ((cbgt) a3.f164949b).f177087d = cbij8;
                }
                cbgt cbgt3 = (cbgt) a3.mo74062i();
                new Object[1][0] = cbgt3;
                azph.m85998a(this.f99339a).mo55137a(134, this.f99415c);
                return cbgt3;
            }
            azcm.m85300a(this.f99339a).mo54647a(this.f99415c, this.f99419g, this.f99420h, this.f99421i, azph.m85998a(this.f99339a));
            return null;
        }
        do {
            bxvd da3 = cbmg.f177616d.mo74144da();
            String string = query.getString(0);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            string.getClass();
            ((cbmg) da3.f164949b).f177618a = string;
            long j = query.getLong(1);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((cbmg) da3.f164949b).f177619b = j;
            if (query.getInt(2) == 1) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((cbmg) da3.f164949b).f177620c = 2;
            }
            arrayList.add((cbmg) da3.mo74062i());
        } while (query.moveToNext());
        if (query != null) {
        }
        this.f99419g = new ArrayList();
        size = arrayList.size();
        while (i2 < size) {
        }
        if (this.f99419g.size() != 0) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbgt cbgt = (cbgt) obj;
        azoj.m85931a("SendMessageReceiptH", exc, "Error sending rpc", new Object[0]);
        azph.m85998a(this.f99339a).mo55155a(126, exc, this.f99415c);
        azho.m85727a(this.f99339a, this.f99416d, exc, this.f99417e, this.f99423k, this.f99424l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbgt cbgt = (cbgt) obj;
        Object[] objArr = {(cbgu) obj2};
        azcm.m85300a(this.f99339a).mo54647a(this.f99415c, this.f99419g, this.f99420h, this.f99421i, azph.m85998a(this.f99339a));
    }
}
