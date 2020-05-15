package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Collections;

/* renamed from: azgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgy extends azgx {

    /* renamed from: a */
    private final Context f99330a;

    /* renamed from: g */
    private final azph f99331g;

    /* renamed from: h */
    private final azet f99332h;

    public azgy(cbkj cbkj, Context context, azet azet, azph azph) {
        super(cbkj);
        this.f99330a = context;
        this.f99332h = azet;
        this.f99331g = azph;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId) {
        int b;
        cbij cbij;
        cbmh cbmh = (cbmh) bxxc;
        cbma cbma = cbkj.f177415i;
        if (cbma == null) {
            cbma cbma2 = cbkj.f177413g;
            if (cbma2 == null) {
                return null;
            }
            cbma cbma3 = cbkj.f177414h;
            if (cbma3 == null) {
                cbma3 = cbma.f177591f;
            }
            aznz a = aznz.m85890a(cbma2, cbma3);
            if (a != null || (b = cbki.m127938b(cbkj.f177410d)) == 0 || b != 15 || (cbij = (cbij) azol.m85935a((bxxk) cbij.f177251e.mo74142c(7), cbkj.f177411e.mo73780k())) == null) {
                return a;
            }
            cbma cbma4 = cbkj.f177414h;
            if (cbma4 == null) {
                cbma4 = cbma.f177591f;
            }
            return azgv.m85634a(cbij, localEntityId, LocalEntityId.m94551b(cbma4));
        }
        cbma cbma5 = cbkj.f177414h;
        if (cbma5 == null) {
            cbma5 = cbma.f177591f;
        }
        return aznz.m85890a(cbma, cbma5);
    }

    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0142 A[Catch:{ all -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014d A[Catch:{ all -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014f A[Catch:{ all -> 0x0168 }] */
    /* renamed from: b */
    public final azdd mo54862b() {
        int i;
        int i2;
        bxwc bxwc;
        String str;
        int i3;
        int i4;
        String str2;
        SQLiteDatabase sQLiteDatabase;
        int i5;
        String str3 = "status";
        int a = cipj.m150694a(((cbmh) this.f99326c).f177623a);
        if (a != 0 && a == 3) {
            i = 33;
        } else {
            int a2 = cipj.m150694a(((cbmh) this.f99326c).f177623a);
            if (a2 != 0 && a2 == 4) {
                i = 34;
            } else {
                this.f99332h.mo54843a(Collections.singletonList(this.f99325b));
                return null;
            }
        }
        bxwc bxwc2 = ((cbmh) this.f99326c).f177624b;
        int size = bxwc2.size();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            cbmg cbmg = (cbmg) bxwc2.get(i7);
            if (cbmg.f177620c == 0) {
                azcm a3 = azcm.m85300a(this.f99330a);
                aznz aznz = this.f99328e;
                String str4 = cbmg.f177618a;
                azph azph = this.f99331g;
                if (!a3.mo54658b()) {
                    azoj.m85933c("DatabaseOperations", "Database is not writable.", new Object[i6]);
                    str = str3;
                    bxwc = bxwc2;
                    i2 = size;
                    i3 = 0;
                } else {
                    a3.f98996b.beginTransaction();
                    try {
                        SQLiteDatabase sQLiteDatabase2 = a3.f98996b;
                        String[] strArr = new String[2];
                        strArr[i6] = str3;
                        strArr[1] = "timestamp_ms";
                        String[] strArr2 = new String[1];
                        strArr2[i6] = str4;
                        Cursor query = sQLiteDatabase2.query("messages", strArr, "message_id == ? ", strArr2, null, null, null);
                        long j = 0;
                        if (query != null) {
                            if (query.moveToFirst()) {
                                i5 = query.getInt(i6);
                                j = query.getLong(1);
                            } else {
                                i5 = 0;
                            }
                            query.close();
                            i4 = i5;
                        } else {
                            i4 = 0;
                        }
                        if (azdd.m85388a(i4)) {
                            sQLiteDatabase = a3.f98996b;
                        } else {
                            if (i == 33) {
                                if (i4 == 34) {
                                    sQLiteDatabase = a3.f98996b;
                                }
                            }
                            ContentValues contentValues = new ContentValues();
                            Integer valueOf = Integer.valueOf(i);
                            contentValues.put(str3, valueOf);
                            str = str3;
                            bxwc = bxwc2;
                            i2 = size;
                            int update = a3.f98996b.update("messages", contentValues, "message_id == ? AND status == ?", new String[]{str4, String.valueOf(i4)});
                            Object[] objArr = {Integer.valueOf(update), valueOf};
                            if (azph != null) {
                                int a4 = azcm.m85299a(i);
                                if (a4 != 26) {
                                    if (a4 != 22) {
                                        str2 = null;
                                        if (str2 != null) {
                                            azph.mo55161a(str2, System.currentTimeMillis() - j);
                                        }
                                        if (a4 == 2) {
                                            azph.mo55131a(a4, 3, str4, aznz);
                                        }
                                    }
                                }
                                str2 = !aznz.mo55105c() ? a4 != 26 ? "Matchstick.Latency.GroupMessage.SentToDelivered.Time" : "Matchstick.Latency.GroupMessage.SentToRead.Time" : a4 != 26 ? "Matchstick.Latency.OneOnOneMessage.SentToDelivered.Time" : "Matchstick.Latency.OneOnOneMessage.SentToRead.Time";
                                if (str2 != null) {
                                }
                                if (a4 == 2) {
                                }
                            }
                            a3.f98996b.setTransactionSuccessful();
                            a3.f98996b.endTransaction();
                            i3 = update != 1 ? 0 : 1;
                        }
                        sQLiteDatabase.endTransaction();
                        str = str3;
                        bxwc = bxwc2;
                        i2 = size;
                        i3 = 0;
                    } catch (Throwable th) {
                        a3.f98996b.endTransaction();
                        throw th;
                    }
                }
                i8 += i3;
            } else {
                str = str3;
                bxwc = bxwc2;
                i2 = size;
            }
            i7++;
            str3 = str;
            bxwc2 = bxwc;
            size = i2;
            i6 = 0;
        }
        this.f99332h.mo54843a(Collections.singletonList(this.f99325b));
        if (i8 <= 0) {
            return null;
        }
        this.f99330a.getContentResolver().notifyChange(DatabaseProvider.m94534b(this.f99328e.f99774a), null);
        return null;
    }

    /* renamed from: c */
    public final void mo54863c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo54916a(cbkj cbkj) {
        int b = cbki.m127938b(cbkj.f177410d);
        if (b != 0 && b == 10) {
            return (cbmh) azol.m85935a((bxxk) cbmh.f177621c.mo74142c(7), cbkj.f177411e.mo73780k());
        }
        int b2 = cbki.m127938b(cbkj.f177410d);
        if (b2 == 0 || b2 != 15) {
            return null;
        }
        cbij cbij = (cbij) azol.m85935a((bxxk) cbij.f177251e.mo74142c(7), cbkj.f177411e.mo73780k());
        if (cbij.f177253a.size() <= 0 || ((cbil) cbij.f177253a.get(0)).f177259a != 3) {
            return null;
        }
        cbil cbil = (cbil) cbij.f177253a.get(0);
        if (cbil.f177259a == 3) {
            return (cbmh) cbil.f177260b;
        }
        return cbmh.f177621c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc) {
        cbmh cbmh = (cbmh) bxxc;
        cbma cbma = cbkj.f177415i;
        if (cbma != null) {
            return LocalEntityId.m94551b(cbma);
        }
        cbma cbma2 = cbkj.f177413g;
        if (cbma2 == null) {
            return null;
        }
        return LocalEntityId.m94551b(cbma2);
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        bxxc bxxc;
        if (!(this.f99325b.isEmpty() || this.f99328e == null || ((!cfeo.m138873d() && !this.f99328e.mo55108f()) || (bxxc = this.f99326c) == null || ((cbmh) bxxc).f177624b.size() == 0))) {
            int a = cipj.m150694a(((cbmh) this.f99326c).f177623a);
            if (a != 0 && a == 3) {
                return true;
            }
            int a2 = cipj.m150694a(((cbmh) this.f99326c).f177623a);
            if (a2 == 0 || a2 != 4) {
                return false;
            }
            return true;
        }
        return false;
    }
}
