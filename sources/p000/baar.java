package p000;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.zip.CRC32;

/* renamed from: baar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baar implements cayy {

    /* renamed from: a */
    private final cijl f100390a;

    public baar(cijl cijl) {
        this.f100390a = cijl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129 A[SYNTHETIC, Splitter:B:38:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e A[Catch:{ IOException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0157  */
    /* renamed from: a */
    public static bqgg m86458a(baam baam) {
        bqgg bqgg;
        bygw bygw;
        IOException iOException;
        baam baam2 = baam;
        bygw bygw2 = baam2.f100379h;
        if (bygw2 == null) {
            bqgg = baam2.f100375d.f101581d;
            if (bqgg == null) {
                try {
                    baaw baaw = baam2.f100374c;
                    String[] a = baaw.mo55552a();
                    if (a != null) {
                        int length = a.length - 1;
                        iOException = null;
                        while (true) {
                            if (length < 0) {
                                break;
                            }
                            try {
                                ByteBuffer wrap = ByteBuffer.wrap(bobi.m111041b(new File(baaw.f100398b, a[length])));
                                baqt baqt = baaw.f100396f;
                                if (wrap.remaining() >= 12) {
                                    int i = wrap.getInt();
                                    int position = wrap.position();
                                    int i2 = position + i;
                                    int i3 = i + 8;
                                    if (i3 > wrap.remaining()) {
                                        String format = String.format(Locale.US, "Buffer underflow (need %d, have %d). Probably corrupt input giving us wrong length %d", Integer.valueOf(i3), Integer.valueOf(wrap.remaining()), Integer.valueOf(i));
                                        Log.e("ChecksumStorageUtils", format);
                                        throw new IOException(format);
                                    } else if (i >= 0) {
                                        long j = wrap.getLong(i2);
                                        byte[] array = wrap.array();
                                        int arrayOffset = wrap.arrayOffset() + position;
                                        CRC32 crc32 = new CRC32();
                                        crc32.update(array, arrayOffset, i);
                                        long value = crc32.getValue();
                                        if (value == j) {
                                            ByteBuffer slice = wrap.slice();
                                            slice.limit(i);
                                            wrap.position(i2 + 8);
                                            bygw = (bygw) ((bxxc) ((bxxk) ((GeneratedMessageLite) baqt.f101567a).mo74142c(7)).mo73654a(bxuc.m123418a(slice)));
                                        } else {
                                            Log.e("ChecksumStorageUtils", String.format("Corrupt data, expected CRC: %d computed CRC: %d", Long.valueOf(j), Long.valueOf(value)));
                                            throw new IOException("Bad CRC (see logs).");
                                        }
                                    } else {
                                        String format2 = String.format(Locale.US, "Got negative payload size (%d) from input - probably corrupt.", Integer.valueOf(i));
                                        Log.e("ChecksumStorageUtils", format2);
                                        throw new IOException(format2);
                                    }
                                } else {
                                    String format3 = String.format(Locale.US, "Buffer underflow (metadata needs at least %d bytes, have %d)", 12, Integer.valueOf(wrap.remaining()));
                                    Log.e("ChecksumStorageUtils", format3);
                                    throw new IOException(format3);
                                }
                            } catch (IOException e) {
                                if (iOException == null) {
                                    iOException = e;
                                }
                                length--;
                            }
                        }
                        if (bygw == null) {
                            bqgg = bqga.m112775a(bygw);
                        }
                        if (bqgg == null) {
                            bqgg = baam.mo55547a();
                        }
                        baam2.f100375d.mo55893a(bqgg);
                    } else {
                        iOException = null;
                    }
                    if (iOException == null) {
                        bygw = null;
                        if (bygw == null) {
                        }
                        if (bqgg == null) {
                        }
                        baam2.f100375d.mo55893a(bqgg);
                    } else {
                        throw new IOException("Failure to read any locally stored ChannelConfigList. Cause contains first failure.", iOException);
                    }
                } catch (IOException e2) {
                    ((achw) baam2.f100373b.mo16713a()).mo25418e("Failed to read stored config", new Object[0]);
                    ((acdc) baam2.f100377f.mo16713a()).mo32707a("MDH channel config read failure", e2);
                }
            }
            if (bqgg.isDone()) {
                try {
                    bqga.m112780a((Future) bqgg);
                } catch (ExecutionException e3) {
                    baam2.f100376e.mo32790a(false, cemg.f182977a.mo6606a().mo79342c(), cemg.f182977a.mo6606a().mo79341b(), 1, false, false, null);
                }
                if (SystemClock.elapsedRealtime() > baam2.f100380i) {
                    baam2.f100376e.mo32790a(false, cemg.f182977a.mo6606a().mo79344e(), cemg.f182977a.mo6606a().mo79343d(), 1, true, true, null);
                    baam2.f100380i = SystemClock.elapsedRealtime() + (cemg.f182977a.mo6606a().mo79346g() * 1000);
                }
            }
        } else {
            bqgg = bqga.m112775a(bygw2);
        }
        cazf.m127593a(bqgg, "Cannot return null from a non-@Nullable @Provides method");
        return bqgg;
    }

    /* renamed from: b */
    public final bqgg mo6445a() {
        return m86458a((baam) this.f100390a.mo6445a());
    }
}
