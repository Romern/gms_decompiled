package p000;

import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: azas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azas extends AbstractWindowedCursor {

    /* renamed from: e */
    private static final String[] f98876e = {"message_id", "conversation_id", "sender_id", "sender_type", "local_timestamp_ms", "server_timestamp_ms", "message_status", "content_type", "text", "media_mime_type", "media_size", "media_thumbnail", "media_download_uri", "media_local_uri", "unsupported_content_type", "unsupported_content_format", "unsupported_content"};

    /* renamed from: a */
    private final Context f98877a;

    /* renamed from: b */
    private final Cursor f98878b;

    /* renamed from: c */
    private final String f98879c;

    /* renamed from: d */
    private final azar f98880d = new azar(this.f98877a, this.f98878b, this.f98879c);

    public azas(Context context, Cursor cursor, String str) {
        this.f98877a = context;
        this.f98878b = cursor;
        this.f98879c = str;
    }

    /* renamed from: a */
    private static boolean m85166a(CursorWindow cursorWindow, Integer num, int i, int i2) {
        return cursorWindow.putLong((long) num.intValue(), i, i2);
    }

    public final void close() {
        this.f98878b.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02f2, code lost:
        r23.freeLastRow();
     */
    public final void fillWindow(int i, CursorWindow cursorWindow) {
        String str;
        int i2;
        long j;
        String str2;
        String str3;
        byte[] bArr;
        String str4;
        String str5;
        String str6;
        byte[] bArr2;
        bxtx bxtx;
        cbin cbin;
        cbin cbin2;
        bxtx bxtx2;
        cbin cbin3;
        bxtx bxtx3;
        cbil c;
        bxtx bxtx4;
        cbin cbin4;
        bxtx bxtx5;
        int i3;
        int i4 = i;
        CursorWindow cursorWindow2 = cursorWindow;
        if (i4 >= 0 && i4 < this.f98878b.getCount()) {
            int position = this.f98878b.getPosition();
            this.f98878b.moveToPosition(i4);
            cursorWindow.clear();
            cursorWindow2.setStartPosition(i4);
            cursorWindow2.setNumColumns(f98876e.length);
            while (true) {
                if (cursorWindow.allocRow()) {
                    if (m85168a(cursorWindow2, this.f98880d.f98872b.getString(1), i4, 0)) {
                        aznz a = aznz.m85891a(this.f98880d.f98872b.getString(13));
                        if (m85168a(cursorWindow2, a != null ? a.f99777d : "", i4, 1)) {
                            azar azar = this.f98880d;
                            if (!azar.m85160a(azar.mo54549e())) {
                                str = azar.f98872b.getString(2);
                            } else {
                                str = azar.f98873c;
                            }
                            if (m85168a(cursorWindow2, str, i4, 2)) {
                                azar azar2 = this.f98880d;
                                if (azar.m85160a(azar2.mo54549e()) || (i3 = azar2.f98872b.getInt(3)) == 1) {
                                    i2 = 1;
                                } else {
                                    if (i3 != 2) {
                                        if (i3 == 3) {
                                            i2 = 3;
                                        } else if (i3 != 4) {
                                            i2 = i3 != 7 ? 0 : 2;
                                        }
                                    }
                                    i2 = 4;
                                }
                                if (m85166a(cursorWindow2, Integer.valueOf(i2), i4, 3) && m85167a(cursorWindow2, Long.valueOf(this.f98880d.f98872b.getLong(11)), i4, 4)) {
                                    String str7 = "";
                                    if (m85167a(cursorWindow2, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(this.f98880d.f98872b.getLong(10))), i4, 5)) {
                                        int e = this.f98880d.mo54549e();
                                        long j2 = 0;
                                        if (e != 1 && e != 2) {
                                            if (e != 3 && e != 4) {
                                                switch (e) {
                                                    case 30:
                                                    case 32:
                                                        j = 256;
                                                        break;
                                                    case 31:
                                                        j = 257;
                                                        break;
                                                    case 33:
                                                        j = 258;
                                                        break;
                                                    case 34:
                                                        j = 259;
                                                        break;
                                                    default:
                                                        j = 0;
                                                        break;
                                                }
                                            } else {
                                                j = 2;
                                            }
                                        } else {
                                            j = 1;
                                        }
                                        if (m85167a(cursorWindow2, Long.valueOf(j), i4, 6) && m85166a(cursorWindow2, Integer.valueOf(this.f98880d.mo54545a()), i4, 7)) {
                                            azar azar3 = this.f98880d;
                                            if (azar3.mo54545a() == 1) {
                                                str2 = azpi.m86066a(azar3.f98872b.getBlob(7));
                                            } else {
                                                str2 = str7;
                                            }
                                            if (m85168a(cursorWindow2, str2, i4, 8)) {
                                                azar azar4 = this.f98880d;
                                                if (azar4.mo54545a() != 2) {
                                                    str3 = str7;
                                                } else {
                                                    cbil c2 = azar4.mo54547c();
                                                    if (c2 != null && c2.f177259a == 2) {
                                                        str3 = ((cbin) c2.f177260b).f177274c;
                                                    } else {
                                                        str3 = str7;
                                                    }
                                                }
                                                if (m85168a(cursorWindow2, str3, i4, 9)) {
                                                    azar azar5 = this.f98880d;
                                                    if (azar5.mo54545a() == 2 && (c = azar5.mo54547c()) != null && c.f177259a == 2) {
                                                        cbin cbin5 = (cbin) c.f177260b;
                                                        if (cbin5.f177272a == 3) {
                                                            bxtx4 = (bxtx) cbin5.f177273b;
                                                        } else {
                                                            bxtx4 = bxtx.f164797b;
                                                        }
                                                        if (!bxtx4.mo73779j()) {
                                                            if (c.f177259a == 2) {
                                                                cbin4 = (cbin) c.f177260b;
                                                            } else {
                                                                cbin4 = cbin.f177270f;
                                                            }
                                                            if (cbin4.f177272a == 3) {
                                                                bxtx5 = (bxtx) cbin4.f177273b;
                                                            } else {
                                                                bxtx5 = bxtx.f164797b;
                                                            }
                                                            j2 = (long) bxtx5.mo73744a();
                                                        }
                                                    }
                                                    if (m85167a(cursorWindow2, Long.valueOf(j2), i4, 10)) {
                                                        azar azar6 = this.f98880d;
                                                        if (azar6.mo54545a() != 2) {
                                                            bArr = azar.f98871a;
                                                        } else {
                                                            cbil c3 = azar6.mo54547c();
                                                            if (c3 != null && c3.f177259a == 2) {
                                                                cbio cbio = ((cbin) c3.f177260b).f177275d;
                                                                if (cbio == null) {
                                                                    cbio = cbio.f177277c;
                                                                }
                                                                if (cbio.f177279a == null) {
                                                                    bArr = azar.f98871a;
                                                                } else {
                                                                    if (c3.f177259a == 2) {
                                                                        cbin3 = (cbin) c3.f177260b;
                                                                    } else {
                                                                        cbin3 = cbin.f177270f;
                                                                    }
                                                                    cbio cbio2 = cbin3.f177275d;
                                                                    if (cbio2 == null) {
                                                                        cbio2 = cbio.f177277c;
                                                                    }
                                                                    cbhy cbhy = cbio2.f177279a;
                                                                    if (cbhy == null) {
                                                                        cbhy = cbhy.f177214d;
                                                                    }
                                                                    if (cbhy.f177216a == 1) {
                                                                        bxtx3 = (bxtx) cbhy.f177217b;
                                                                    } else {
                                                                        bxtx3 = bxtx.f164797b;
                                                                    }
                                                                    bArr = bxtx3.mo73780k();
                                                                }
                                                            } else {
                                                                bArr = azar.f98871a;
                                                            }
                                                        }
                                                        if (m85169a(cursorWindow2, bArr, i4, 11)) {
                                                            azar azar7 = this.f98880d;
                                                            if (azar7.mo54545a() != 2) {
                                                                str4 = str7;
                                                            } else {
                                                                cbil c4 = azar7.mo54547c();
                                                                if (c4 != null && c4.f177259a == 2) {
                                                                    cbin cbin6 = (cbin) c4.f177260b;
                                                                    if (cbin6.f177272a == 5) {
                                                                        bxtx = (bxtx) cbin6.f177273b;
                                                                    } else {
                                                                        bxtx = bxtx.f164797b;
                                                                    }
                                                                    if (!bxtx.mo73779j()) {
                                                                        if (c4.f177259a == 2) {
                                                                            cbin2 = (cbin) c4.f177260b;
                                                                        } else {
                                                                            cbin2 = cbin.f177270f;
                                                                        }
                                                                        if (cbin2.f177272a == 5) {
                                                                            bxtx2 = (bxtx) cbin2.f177273b;
                                                                        } else {
                                                                            bxtx2 = bxtx.f164797b;
                                                                        }
                                                                        str4 = Base64.encodeToString(bxtx2.mo73780k(), 0);
                                                                    } else {
                                                                        if (c4.f177259a == 2) {
                                                                            cbin = (cbin) c4.f177260b;
                                                                        } else {
                                                                            cbin = cbin.f177270f;
                                                                        }
                                                                        str4 = cbin.f177272a == 2 ? (String) cbin.f177273b : str7;
                                                                    }
                                                                } else {
                                                                    str4 = str7;
                                                                }
                                                            }
                                                            if (m85168a(cursorWindow2, str4, i4, 12)) {
                                                                azar azar8 = this.f98880d;
                                                                if (azar8.mo54545a() != 2) {
                                                                    str5 = str7;
                                                                } else {
                                                                    cbil c5 = azar8.mo54547c();
                                                                    if (c5 != null && c5.f177259a == 2) {
                                                                        str5 = DatabaseProvider.m94539c(azar8.f98874d, azar8.f98872b.getString(1));
                                                                        if (TextUtils.isEmpty(str5)) {
                                                                            str5 = str7;
                                                                        }
                                                                    } else {
                                                                        str5 = str7;
                                                                    }
                                                                }
                                                                if (m85168a(cursorWindow2, str5, i4, 13) && m85168a(cursorWindow2, this.f98880d.mo54546b(), i4, 14)) {
                                                                    bxte d = this.f98880d.mo54548d();
                                                                    if (d != null) {
                                                                        str6 = d.f164765a;
                                                                    } else {
                                                                        str6 = str7;
                                                                    }
                                                                    if (m85168a(cursorWindow2, str6, i4, 15)) {
                                                                        bxte d2 = this.f98880d.mo54548d();
                                                                        if (d2 != null) {
                                                                            bArr2 = d2.f164766b.mo73780k();
                                                                        } else {
                                                                            bArr2 = azar.f98871a;
                                                                        }
                                                                        if (m85169a(cursorWindow2, bArr2, i4, 16)) {
                                                                            i4++;
                                                                            if (!this.f98878b.moveToNext()) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f98878b.moveToPosition(position);
        }
    }

    public final int getColumnCount() {
        return f98876e.length;
    }

    public final String getColumnName(int i) {
        return f98876e[i];
    }

    public final String[] getColumnNames() {
        return f98876e;
    }

    public final int getCount() {
        return this.f98878b.getCount();
    }

    /* renamed from: a */
    private static boolean m85167a(CursorWindow cursorWindow, Long l, int i, int i2) {
        return cursorWindow.putLong(l.longValue(), i, i2);
    }

    /* renamed from: a */
    private static boolean m85168a(CursorWindow cursorWindow, String str, int i, int i2) {
        return str == null || cursorWindow.putString(str, i, i2);
    }

    /* renamed from: a */
    private static boolean m85169a(CursorWindow cursorWindow, byte[] bArr, int i, int i2) {
        return bArr == null || cursorWindow.putBlob(bArr, i, i2);
    }
}
