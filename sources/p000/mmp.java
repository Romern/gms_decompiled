package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.Telephony;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mmp implements mmh {

    /* renamed from: a */
    static final String[] f34019a = {"_id", "ct", "cl"};

    /* renamed from: b */
    private static final lvn f34020b = new lvn("MmsAttachmentsHandler");

    /* renamed from: c */
    private final ContentResolver f34021c;

    public mmp(ContentResolver contentResolver) {
        sdo.m34959a(contentResolver);
        this.f34021c = contentResolver;
    }

    /* renamed from: a */
    static Uri m25347a(int i) {
        return Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").appendPath(Integer.toString(i)).build();
    }

    /* renamed from: a */
    public final InputStream mo20162a(mph mph) {
        try {
            return this.f34021c.openInputStream(m25347a(Integer.parseInt(mph.f34146d)));
        } catch (FileNotFoundException e) {
            f34020b.logVerbose("Unable to open stream for item %s", mph.f34146d);
            String valueOf = String.valueOf(mph.f34146d);
            throw new mmq(valueOf.length() == 0 ? new String("Unable to find stream for mms partId=") : "Unable to find stream for mms partId=".concat(valueOf), e);
        }
    }

    /* renamed from: a */
    public final List mo20163a() {
        ParcelFileDescriptor openFileDescriptor;
        f34020b.logVerbose("Indexing MMS attachments", new Object[0]);
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f34021c.query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build(), f34019a, null, null, "_id ASC");
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(query.getColumnIndex("ct"));
                    String string2 = query.getString(query.getColumnIndex("cl"));
                    if (mad.m24755a(string)) {
                        if (string2 == null) {
                            f34020b.logVerbose("Content locations is empty for partId = %d", Integer.valueOf(i));
                        } else {
                            int count = query.getCount();
                            bxvd da = mph.f34141f.mo74144da();
                            String num = Integer.toString(i);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            mph mph = (mph) da.f164949b;
                            num.getClass();
                            mph.f34143a |= 1;
                            mph.f34146d = num;
                            bxvd da2 = mpf.f34120d.mo74144da();
                            String a = mac.m24749a(string2, i);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            mpf mpf = (mpf) da2.f164949b;
                            a.getClass();
                            mpf.f34122a |= 1;
                            mpf.f34123b = a;
                            mpf mpf2 = (mpf) da2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            mph mph2 = (mph) da.f164949b;
                            mpf2.getClass();
                            mph2.f34145c = mpf2;
                            mph2.f34144b = 100;
                            long j = 0;
                            if (((long) count) > cckx.f179265a.mo6606a().mo76206b()) {
                                j = cckx.f179265a.mo6606a().mo76207c();
                            } else {
                                try {
                                    openFileDescriptor = this.f34021c.openFileDescriptor(m25347a(i), "r");
                                    long statSize = openFileDescriptor.getStatSize();
                                    if (openFileDescriptor != null) {
                                        openFileDescriptor.close();
                                    }
                                    j = statSize;
                                } catch (FileNotFoundException e) {
                                    f34020b.logVerbose("Unable to open file descriptor for item %d", Integer.valueOf(i));
                                } catch (IOException e2) {
                                    f34020b.mo25408a("Error while getting size of partId=%d", e2, Integer.valueOf(i));
                                } catch (Throwable th) {
                                    bqye.m113761a(th, th);
                                }
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            mph mph3 = (mph) da.f164949b;
                            mph3.f34143a |= 2;
                            mph3.f34147e = j;
                            arrayList.add((mph) da.mo74062i());
                        }
                    }
                } catch (Throwable th2) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th3) {
                            bqye.m113761a(th2, th3);
                        }
                    }
                    throw th2;
                }
            }
            query.close();
            return arrayList;
        }
        f34020b.mo25416d("Content provider returned null cursor.", new Object[0]);
        return bngx.m109376e();
        throw th;
    }

    /* renamed from: a */
    public final void mo20164a(mph mph, InputStream inputStream) {
        srz.m36171a((Closeable) inputStream);
    }
}
