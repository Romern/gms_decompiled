package p000;

import android.net.Uri;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.MddFile;
import com.google.autofill.detection.p098ml.ModelConfig;
import com.google.autofill.detection.p098ml.NeuralNetwork;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* renamed from: kyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kyi implements kyo {

    /* renamed from: a */
    public static final srn f25407a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public static final Object f25408b = new Object();

    /* renamed from: c */
    public static MappedByteBuffer f25409c = null;

    /* renamed from: d */
    public static WeakReference f25410d = null;

    /* renamed from: e */
    public static MddFile f25411e = null;

    /* renamed from: f */
    public static MddFile f25412f = null;

    /* renamed from: g */
    private final afkl f25413g;

    /* renamed from: h */
    private final befa f25414h;

    public kyi(afkl afkl, befa befa) {
        this.f25413g = afkl;
        this.f25414h = befa;
    }

    /* renamed from: a */
    private final NeuralNetwork m18781a(MddFile mddFile) {
        if (mddFile == null) {
            return null;
        }
        synchronized (f25408b) {
            MappedByteBuffer mappedByteBuffer = f25409c;
            if (mappedByteBuffer == null) {
                try {
                    MappedByteBuffer mappedByteBuffer2 = (MappedByteBuffer) this.f25414h.mo60643a(Uri.parse(mddFile.f79970b), new kyh(), new beer[0]);
                    f25409c = mappedByteBuffer2;
                    NeuralNetwork a = m18782a(mappedByteBuffer2);
                    return a;
                } catch (FileNotFoundException e) {
                    bnsl bnsl = (bnsl) f25407a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kyi", "a", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to find cached MDD file for neural network.");
                    return null;
                } catch (IOException e2) {
                    bnsl bnsl2 = (bnsl) f25407a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("kyi", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Exception while executing mdd read task for neural network");
                    return null;
                }
            } else {
                NeuralNetwork a2 = m18782a(mappedByteBuffer);
                return a2;
            }
        }
    }

    /* renamed from: b */
    private final ModelConfig m18785b(MddFile mddFile) {
        if (mddFile == null) {
            return null;
        }
        if (cciw.m129953b()) {
            synchronized (f25408b) {
                if (f25410d != null) {
                    ModelConfig modelConfig = (ModelConfig) f25410d.get();
                    if (modelConfig != null) {
                        return modelConfig;
                    }
                }
                try {
                    ModelConfig parseFrom = ModelConfig.parseFrom((byte[]) this.f25414h.mo60643a(Uri.parse(mddFile.f79970b), behp.m95056a(), new beer[0]));
                    f25410d = new WeakReference(parseFrom);
                    return parseFrom;
                } catch (FileNotFoundException e) {
                    bnsl bnsl = (bnsl) f25407a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kyi", "b", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to find cached MDD file for model config.");
                    return null;
                } catch (IOException e2) {
                    bnsl bnsl2 = (bnsl) f25407a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("kyi", "b", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Exception while executing mdd read task for model config");
                    return null;
                } catch (blma e3) {
                    e = e3;
                    bnsl bnsl3 = (bnsl) f25407a.mo68387b();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68432a("kyi", "b", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Exception while de-serializing model config");
                    return null;
                } catch (blmh e4) {
                    e = e4;
                    bnsl bnsl32 = (bnsl) f25407a.mo68387b();
                    bnsl32.mo68437a(e);
                    bnsl32.mo68432a("kyi", "b", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl32.mo68405a("Exception while de-serializing model config");
                    return null;
                }
            }
        } else {
            try {
                return ModelConfig.parseFrom((byte[]) this.f25414h.mo60643a(Uri.parse(mddFile.f79970b), behp.m95056a(), new beer[0]));
            } catch (FileNotFoundException e5) {
                bnsl bnsl4 = (bnsl) f25407a.mo68388c();
                bnsl4.mo68437a(e5);
                bnsl4.mo68432a("kyi", "b", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to find cached MDD file for model config.");
                return null;
            } catch (IOException e6) {
                bnsl bnsl5 = (bnsl) f25407a.mo68387b();
                bnsl5.mo68437a(e6);
                bnsl5.mo68432a("kyi", "b", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Exception while executing mdd read task for model config");
                return null;
            } catch (blma | blmh e7) {
                bnsl bnsl6 = (bnsl) f25407a.mo68387b();
                bnsl6.mo68437a(e7);
                bnsl6.mo68432a("kyi", "b", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("Exception while de-serializing model config");
                return null;
            }
        }
    }

    /* renamed from: c */
    public final void mo14942c() {
        if (lrb.m19569b()) {
            this.f25413g.mo34920b("autofill-field-detection-model", "com.google.android.gms");
        }
    }

    /* renamed from: d */
    public final void mo14943d() {
        afkl afkl = this.f25413g;
        FileGroupRequest fileGroupRequest = new FileGroupRequest("autofill-field-detection-model", "com.google.android.gms", null);
        roz b = rpa.m34196b();
        b.mo24978a(new afkh(fileGroupRequest));
        b.f43473b = new Feature[]{abpq.f57887e};
        afkl.mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    private static NeuralNetwork m18782a(ByteBuffer byteBuffer) {
        try {
            return NeuralNetwork.createFromFlatBuffer(byteBuffer);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f25407a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kyi", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception while de-serializing neural network");
            return null;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m18783a(Exception exc) {
        bnsl bnsl = (bnsl) f25407a.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("kyi", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Exception while executing mdd read task for ml model");
    }

    /* renamed from: a */
    public static boolean m18784a(MddFile mddFile, MddFile mddFile2) {
        if (mddFile == null && mddFile2 == null) {
            return true;
        }
        return mddFile != null && mddFile2 != null && mddFile.f79969a.equals(mddFile2.f79969a) && mddFile.f79970b.equals(mddFile2.f79970b);
    }

    /* renamed from: a */
    public final kyn mo14939a() {
        NeuralNetwork neuralNetwork;
        ModelConfig modelConfig;
        aucb a = this.f25413g.mo34919a("autofill-field-detection-model", "com.google.android.gms");
        a.mo50373a(new kyf(a));
        a.mo50372a(kyg.f25405a);
        synchronized (f25408b) {
            MddFile mddFile = f25412f;
            neuralNetwork = null;
            if (mddFile == null) {
                modelConfig = null;
            } else if (!cciw.m129953b()) {
                try {
                    modelConfig = ModelConfig.parseFrom((byte[]) this.f25414h.mo60643a(Uri.parse(mddFile.f79970b), behp.m95056a(), new beer[0]));
                } catch (FileNotFoundException e) {
                    bnsl bnsl = (bnsl) f25407a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kyi", "b", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to find cached MDD file for model config.");
                    modelConfig = null;
                } catch (IOException e2) {
                    bnsl bnsl2 = (bnsl) f25407a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68432a("kyi", "b", 208, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Exception while executing mdd read task for model config");
                    modelConfig = null;
                } catch (blma | blmh e3) {
                    bnsl bnsl3 = (bnsl) f25407a.mo68387b();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68432a("kyi", "b", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Exception while de-serializing model config");
                    modelConfig = null;
                }
            } else {
                synchronized (f25408b) {
                    if (f25410d != null) {
                        ModelConfig modelConfig2 = (ModelConfig) f25410d.get();
                        if (modelConfig2 != null) {
                            modelConfig = modelConfig2;
                        }
                    }
                    try {
                        modelConfig = ModelConfig.parseFrom((byte[]) this.f25414h.mo60643a(Uri.parse(mddFile.f79970b), behp.m95056a(), new beer[0]));
                        f25410d = new WeakReference(modelConfig);
                    } catch (FileNotFoundException e4) {
                        bnsl bnsl4 = (bnsl) f25407a.mo68388c();
                        bnsl4.mo68437a(e4);
                        bnsl4.mo68432a("kyi", "b", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Failed to find cached MDD file for model config.");
                        modelConfig = null;
                    } catch (IOException e5) {
                        bnsl bnsl5 = (bnsl) f25407a.mo68387b();
                        bnsl5.mo68437a(e5);
                        bnsl5.mo68432a("kyi", "b", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("Exception while executing mdd read task for model config");
                        modelConfig = null;
                    } catch (blma e6) {
                        e = e6;
                        bnsl bnsl6 = (bnsl) f25407a.mo68387b();
                        bnsl6.mo68437a(e);
                        bnsl6.mo68432a("kyi", "b", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Exception while de-serializing model config");
                        modelConfig = null;
                    } catch (blmh e7) {
                        e = e7;
                        bnsl bnsl62 = (bnsl) f25407a.mo68387b();
                        bnsl62.mo68437a(e);
                        bnsl62.mo68432a("kyi", "b", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl62.mo68405a("Exception while de-serializing model config");
                        modelConfig = null;
                    }
                }
            }
            MddFile mddFile2 = f25411e;
            if (mddFile2 != null) {
                synchronized (f25408b) {
                    MappedByteBuffer mappedByteBuffer = f25409c;
                    if (mappedByteBuffer == null) {
                        try {
                            MappedByteBuffer mappedByteBuffer2 = (MappedByteBuffer) this.f25414h.mo60643a(Uri.parse(mddFile2.f79970b), new kyh(), new beer[0]);
                            f25409c = mappedByteBuffer2;
                            neuralNetwork = m18782a(mappedByteBuffer2);
                        } catch (FileNotFoundException e8) {
                            bnsl bnsl7 = (bnsl) f25407a.mo68388c();
                            bnsl7.mo68437a(e8);
                            bnsl7.mo68432a("kyi", "a", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl7.mo68405a("Failed to find cached MDD file for neural network.");
                        } catch (IOException e9) {
                            bnsl bnsl8 = (bnsl) f25407a.mo68387b();
                            bnsl8.mo68437a(e9);
                            bnsl8.mo68432a("kyi", "a", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl8.mo68405a("Exception while executing mdd read task for neural network");
                        }
                    } else {
                        neuralNetwork = m18782a(mappedByteBuffer);
                    }
                }
            }
        }
        return kyn.m18798a(modelConfig, neuralNetwork);
    }

    /* renamed from: b */
    public final void mo14940b() {
        synchronized (f25408b) {
            f25409c = null;
            f25411e = null;
            f25412f = null;
        }
    }
}
