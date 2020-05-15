package p000;

import android.util.Log;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: abqw */
final /* synthetic */ class abqw implements Runnable {

    /* renamed from: a */
    private final abrv f58021a;

    public abqw(abrv abrv) {
        this.f58021a = abrv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015d A[SYNTHETIC, Splitter:B:85:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0171 A[SYNTHETIC, Splitter:B:92:0x0171] */
    public final void run() {
        acxo acxo;
        abrv abrv = this.f58021a;
        abrv.f58067c.mo32992b(2);
        if (abrv.mo32320d()) {
            NativeIndex.nativeOnSleep(abrv.f58078n.f79071b);
            abzm b = abrv.mo32314b();
            synchronized (b.mo32525a()) {
                if (b.f58818g) {
                    acam acam = b.f58813b;
                    Collection<abss> values = b.f58817f.values();
                    ArrayList arrayList = new ArrayList(values.size());
                    for (abss abss : values) {
                        if (abss != null) {
                            absy absy = abss.f58158c;
                            if (absy == null) {
                                absy = absy.f58176h;
                            }
                            int a = absx.m48236a(absy.f58180c);
                            if (a != 0) {
                                if (a != 1) {
                                }
                            }
                            bxvd da = abst.f58159e.mo74144da();
                            absr absr = abss.f58157b;
                            if (absr == null) {
                                absr = absr.f58134s;
                            }
                            int i = absr.f58137b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abst abst = (abst) da.f164949b;
                            abst.f58161a = 1 | abst.f58161a;
                            abst.f58162b = i;
                            absy absy2 = abss.f58158c;
                            if (absy2 == null) {
                                absy2 = absy.f58176h;
                            }
                            bxwc bxwc = absy2.f58179b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abst abst2 = (abst) da.f164949b;
                            if (!abst2.f58164d.mo73666a()) {
                                abst2.f58164d = GeneratedMessageLite.m124021a(abst2.f58164d);
                            }
                            bxsy.m123078a(bxwc, abst2.f58164d);
                            absy absy3 = abss.f58158c;
                            if (absy3 == null) {
                                absy3 = absy.f58176h;
                            }
                            int i2 = absy3.f58182e;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abst abst3 = (abst) da.f164949b;
                            abst3.f58161a |= 2;
                            abst3.f58163c = i2;
                            arrayList.add((abst) da.mo74062i());
                        }
                    }
                    acxj acxj = ((acan) acam).f59110b;
                    ByteBuffer a2 = stb.m36276a(arrayList, true);
                    if (a2 != null) {
                        if (a2.limit() != 0 && a2.remaining() != 0) {
                            if (Log.isLoggable("Icing", 2)) {
                                absg.m48203d("Writing out (up to) %s for file %s", acky.m49361a((long) a2.remaining()), acxj.f61014c);
                            } else {
                                absg.m48185a("Writing out file %s", acxj.f61014c);
                            }
                            FileOutputStream fileOutputStream = null;
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(acxj.f61015d);
                                try {
                                    if (fileOutputStream2.getChannel().write(a2) == 0) {
                                        absg.m48206e("No bytes actually written out for file %s", acxj.f61014c);
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e) {
                                            absg.m48195b(e, "Error while closing stream to %s", acxj.f61014c);
                                        }
                                    } else {
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e2) {
                                            absg.m48195b(e2, "Error while closing stream to %s", acxj.f61014c);
                                        }
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    fileOutputStream = fileOutputStream2;
                                    try {
                                        absg.m48195b(e, "Error while writing to %s", acxj.f61014c);
                                        if (fileOutputStream != null) {
                                        }
                                        acxo = abrv.f58075k;
                                        if (acxo != null) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream != null) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                absg.m48195b(e, "Error while writing to %s", acxj.f61014c);
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e5) {
                                        absg.m48195b(e5, "Error while closing stream to %s", acxj.f61014c);
                                    }
                                }
                                acxo = abrv.f58075k;
                                if (acxo != null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e6) {
                                        absg.m48195b(e6, "Error while closing stream to %s", acxj.f61014c);
                                    }
                                }
                                throw th;
                            }
                        } else if (acxj.mo33197b()) {
                            absg.m48185a("Asked to write no data, deleting file %s", acxj.f61014c);
                            if (!acxj.f61015d.delete()) {
                                absg.m48192b("Failed to delete file %s", acxj.f61014c);
                            }
                        } else {
                            absg.m48202d("Skipping write out of would be empty file %s", acxj.f61014c);
                        }
                        b.f58818g = false;
                    }
                }
            }
            acxo = abrv.f58075k;
            if (acxo != null) {
                acxo.mo33214b();
            }
        }
    }
}
