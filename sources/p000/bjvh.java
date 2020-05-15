package p000;

import android.text.TextUtils;
import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormSpinner;
import com.google.android.wallet.p097ui.common.InlineSelectView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: bjvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvh {
    /* renamed from: a */
    public static bkdx m104692a(bmfs bmfs, int i, LogContext logContext) {
        int i2 = bmfs.f129158b;
        if (i2 == 1) {
            bmgr bmgr = (bmgr) bmfs.f129159c;
            int i3 = bmgr.f129317a;
            if (i3 == 1) {
                bkan bkan = new bkan();
                bkan.setArguments(bkdx.m105383a(i, (bmgy) bmgr.f129318b, logContext));
                return bkan;
            } else if (i3 == 3) {
                bkaq bkaq = new bkaq();
                bkaq.setArguments(bkdx.m105383a(i, (bmha) bmgr.f129318b, logContext));
                return bkaq;
            } else if (i3 == 2) {
                bkam bkam = new bkam();
                bkam.setArguments(bkdx.m105383a(i, (bmgt) bmgr.f129318b, logContext));
                return bkam;
            } else {
                throw new IllegalArgumentException("Invalid bank account verification form");
            }
        } else if (i2 == 2) {
            bkiu bkiu = new bkiu();
            bkiu.setArguments(bkdx.m105383a(i, (bmgv) bmfs.f129159c, logContext));
            return bkiu;
        } else {
            throw new IllegalArgumentException("Invalid instrument activation form");
        }
    }

    /* renamed from: a */
    public static bmbs m104693a(bmbr bmbr) {
        if (bmbr == null) {
            return null;
        }
        int i = bmbr.f128595l;
        if (i < 0 || i >= bmbr.f128592i.size()) {
            bmbs bmbs = bmbr.f128590g;
            return bmbs == null ? bmbs.f128609j : bmbs;
        }
        bmbs bmbs2 = ((bmbz) bmbr.f128592i.get(i)).f128638c;
        return bmbs2 == null ? bmbs.f128609j : bmbs2;
    }

    /* renamed from: a */
    public static bmdt m104694a(bmds bmds) {
        if (bmds == null) {
            return null;
        }
        bxvd da = bmdt.f128861d.mo74144da();
        bmqf bmqf = bmds.f128855b;
        if (bmqf == null) {
            bmqf = bmqf.f130370r;
        }
        bmqk a = m104699a(bmqf);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmdt bmdt = (bmdt) da.f164949b;
        a.getClass();
        bmdt.f128864b = a;
        int i = bmdt.f128863a | 1;
        bmdt.f128863a = i;
        bmdt.f128863a = i | 2;
        bmdt.f128865c = false;
        return (bmdt) da.mo74062i();
    }

    /* renamed from: a */
    public static bmdy m104695a(bmdx bmdx) {
        bmjk bmjk;
        bmbu bmbu = null;
        if (bmdx == null) {
            return null;
        }
        bxvd da = bmdy.f128893c.mo74144da();
        if (bmdx.f128888a == 1) {
            bmqk a = m104699a((bmqf) bmdx.f128889b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdy bmdy = (bmdy) da.f164949b;
            a.getClass();
            bmdy.f128896b = a;
            bmdy.f128895a = 1;
        }
        if (bmdx.f128888a == 4) {
            bmdt a2 = m104694a((bmds) bmdx.f128889b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdy bmdy2 = (bmdy) da.f164949b;
            a2.getClass();
            bmdy2.f128896b = a2;
            bmdy2.f128895a = 3;
        }
        if (bmdx.f128888a == 2) {
            bmbs a3 = m104693a((bmbr) bmdx.f128889b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdy bmdy3 = (bmdy) da.f164949b;
            a3.getClass();
            bmdy3.f128896b = a3;
            bmdy3.f128895a = 2;
        }
        if (bmdx.f128888a == 5) {
            bmji bmji = (bmji) bmdx.f128889b;
            if (bmji != null) {
                bmjj bmjj = (bmjj) bmjk.f129713f.mo74144da();
                String str = bmji.f129709b;
                if (bmjj.f164950c) {
                    bmjj.mo74035c();
                    bmjj.f164950c = false;
                }
                bmjk bmjk2 = (bmjk) bmjj.f164949b;
                str.getClass();
                int i = bmjk2.f129715a | 1;
                bmjk2.f129715a = i;
                bmjk2.f129716b = str;
                long j = bmji.f129710c;
                int i2 = i | 2;
                bmjk2.f129715a = i2;
                bmjk2.f129717c = j;
                ByteString bxtx = bmji.f129711d;
                bxtx.getClass();
                bmjk2.f129715a = i2 | 4;
                bmjk2.f129718d = bxtx;
                bxwc bxwc = bmji.f129712e;
                int size = bxwc.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bmjj.mo66796a(m104699a((bmqf) bxwc.get(i3)));
                }
                bmjk = (bmjk) bmjj.mo74062i();
            } else {
                bmjk = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdy bmdy4 = (bmdy) da.f164949b;
            bmjk.getClass();
            bmdy4.f128896b = bmjk;
            bmdy4.f128895a = 4;
        }
        if (bmdx.f128888a == 8) {
            bmbt bmbt = (bmbt) bmdx.f128889b;
            if (bmbt != null) {
                bxvd da2 = bmbu.f128626e.mo74144da();
                bmdn bmdn = bmbt.f128622a;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                String str2 = bmdn.f128834b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmbu bmbu2 = (bmbu) da2.f164949b;
                str2.getClass();
                bmbu2.f128628a = 1 | bmbu2.f128628a;
                bmbu2.f128629b = str2;
                bmdn bmdn2 = bmbt.f128622a;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                ByteString bxtx2 = bmdn2.f128836d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmbu bmbu3 = (bmbu) da2.f164949b;
                bxtx2.getClass();
                int i4 = 2 | bmbu3.f128628a;
                bmbu3.f128628a = i4;
                bmbu3.f128630c = bxtx2;
                String str3 = bmbt.f128624c;
                str3.getClass();
                bmbu3.f128628a = i4 | 4;
                bmbu3.f128631d = str3;
                bmbu = (bmbu) da2.mo74062i();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmdy bmdy5 = (bmdy) da.f164949b;
            bmbu.getClass();
            bmdy5.f128896b = bmbu;
            bmdy5.f128895a = 6;
        }
        return (bmdy) da.mo74062i();
    }

    /* renamed from: a */
    public static bmed m104696a(bmeb bmeb) {
        bmec bmec;
        bmee bmee;
        bmee bmee2;
        bmee bmee3;
        bmee bmee4;
        bmee bmee5;
        bmee bmee6;
        bmee bmee7;
        bmee bmee8;
        if (bmeb == null) {
            return null;
        }
        bxvd da = bmed.f128915f.mo74144da();
        bmdn bmdn = bmeb.f128905b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if ((bmdn.f128833a & 1) != 0) {
            bmdn bmdn2 = bmeb.f128905b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            String str = bmdn2.f128834b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed = (bmed) da.f164949b;
            str.getClass();
            bmed.f128917a |= 1;
            bmed.f128918b = str;
        }
        bmdn bmdn3 = bmeb.f128905b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        if ((bmdn3.f128833a & 4) != 0) {
            bmdn bmdn4 = bmeb.f128905b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            ByteString bxtx = bmdn4.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed2 = (bmed) da.f164949b;
            bxtx.getClass();
            bmed2.f128917a |= 2;
            bmed2.f128919c = bxtx;
        }
        int size = bmeb.f128906c.size();
        for (int i = 0; i < size; i++) {
            bmea bmea = (bmea) bmeb.f128906c.get(i);
            if (bmea != null) {
                bxvd da2 = bmec.f128911c.mo74144da();
                int i2 = bmea.f128899a;
                if (i2 == 1) {
                    bmef bmef = (bmef) bmeg.f128929f.mo74144da();
                    if (bmea.f128899a != 1) {
                        bmee = bmee.f128922e;
                    } else {
                        bmee = (bmee) bmea.f128900b;
                    }
                    bmdn bmdn5 = bmee.f128925b;
                    if (bmdn5 == null) {
                        bmdn5 = bmdn.f128831k;
                    }
                    if (!bmdn5.f128834b.isEmpty()) {
                        if (bmea.f128899a == 1) {
                            bmee8 = (bmee) bmea.f128900b;
                        } else {
                            bmee8 = bmee.f128922e;
                        }
                        bmdn bmdn6 = bmee8.f128925b;
                        if (bmdn6 == null) {
                            bmdn6 = bmdn.f128831k;
                        }
                        String str2 = bmdn6.f128834b;
                        if (bmef.f164950c) {
                            bmef.mo74035c();
                            bmef.f164950c = false;
                        }
                        bmeg bmeg = (bmeg) bmef.f164949b;
                        str2.getClass();
                        bmeg.f128931a |= 1;
                        bmeg.f128932b = str2;
                    }
                    if (bmea.f128899a == 1) {
                        bmee2 = (bmee) bmea.f128900b;
                    } else {
                        bmee2 = bmee.f128922e;
                    }
                    bmdn bmdn7 = bmee2.f128925b;
                    if (bmdn7 == null) {
                        bmdn7 = bmdn.f128831k;
                    }
                    if (!bmdn7.f128836d.mo73779j()) {
                        if (bmea.f128899a == 1) {
                            bmee7 = (bmee) bmea.f128900b;
                        } else {
                            bmee7 = bmee.f128922e;
                        }
                        bmdn bmdn8 = bmee7.f128925b;
                        if (bmdn8 == null) {
                            bmdn8 = bmdn.f128831k;
                        }
                        ByteString bxtx2 = bmdn8.f128836d;
                        if (bmef.f164950c) {
                            bmef.mo74035c();
                            bmef.f164950c = false;
                        }
                        bmeg bmeg2 = (bmeg) bmef.f164949b;
                        bxtx2.getClass();
                        bmeg2.f128931a |= 2;
                        bmeg2.f128933c = bxtx2;
                    }
                    if (bmea.f128899a == 1) {
                        bmee3 = (bmee) bmea.f128900b;
                    } else {
                        bmee3 = bmee.f128922e;
                    }
                    int size2 = bmee3.f128926c.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (bmea.f128899a == 1) {
                            bmee6 = (bmee) bmea.f128900b;
                        } else {
                            bmee6 = bmee.f128922e;
                        }
                        bmef.mo66784a(m104695a((bmdx) bmee6.f128926c.get(i3)));
                    }
                    if (bmea.f128899a == 1) {
                        bmee4 = (bmee) bmea.f128900b;
                    } else {
                        bmee4 = bmee.f128922e;
                    }
                    if ((bmee4.f128924a & 2) != 0) {
                        if (bmea.f128899a == 1) {
                            bmee5 = (bmee) bmea.f128900b;
                        } else {
                            bmee5 = bmee.f128922e;
                        }
                        bmjf bmjf = bmee5.f128927d;
                        if (bmjf == null) {
                            bmjf = bmjf.f129685i;
                        }
                        String str3 = bmjf.f129693g;
                        if (bmef.f164950c) {
                            bmef.mo74035c();
                            bmef.f164950c = false;
                        }
                        bmeg bmeg3 = (bmeg) bmef.f164949b;
                        str3.getClass();
                        bmeg3.f128931a |= 4;
                        bmeg3.f128935e = str3;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmec bmec2 = (bmec) da2.f164949b;
                    bmeg bmeg4 = (bmeg) bmef.mo74062i();
                    bmeg4.getClass();
                    bmec2.f128914b = bmeg4;
                    bmec2.f128913a = 1;
                } else if (i2 == 2) {
                    bmdy a = m104695a((bmdx) bmea.f128900b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmec bmec3 = (bmec) da2.f164949b;
                    a.getClass();
                    bmec3.f128914b = a;
                    bmec3.f128913a = 2;
                }
                bmec = (bmec) da2.mo74062i();
            } else {
                bmec = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed3 = (bmed) da.f164949b;
            bmec.getClass();
            bmed3.mo66783a();
            bmed3.f128920d.add(bmec);
        }
        if ((bmeb.f128904a & 2) != 0) {
            bmjf bmjf2 = bmeb.f128908e;
            if (bmjf2 == null) {
                bmjf2 = bmjf.f129685i;
            }
            String str4 = bmjf2.f129693g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmed bmed4 = (bmed) da.f164949b;
            str4.getClass();
            bmed4.f128917a |= 4;
            bmed4.f128921e = str4;
        }
        return (bmed) da.mo74062i();
    }

    /* renamed from: a */
    public static bmft m104697a(Fragment fragment, bmfs bmfs) {
        bxvd da = bmft.f129161e.mo74144da();
        if ((bmfs.f129157a & 1) != 0) {
            bmdn bmdn = bmfs.f129160d;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            ByteString bxtx = bmdn.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmft bmft = (bmft) da.f164949b;
            bxtx.getClass();
            bmft.f129163a |= 4;
            bmft.f129166d = bxtx;
        }
        if (fragment instanceof bkan) {
            bxvd da2 = bmgs.f129319c.mo74144da();
            bkan bkan = (bkan) fragment;
            bxvd da3 = bmgz.f129371e.mo74144da();
            bmdn bmdn2 = ((bmgy) bkan.f124069w).f129367a;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            String str = bmdn2.f128834b;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bmgz bmgz = (bmgz) da3.f164949b;
            str.getClass();
            bmgz.f129373a |= 1;
            bmgz.f129374b = str;
            bmdn bmdn3 = ((bmgy) bkan.f124069w).f129367a;
            if (bmdn3 == null) {
                bmdn3 = bmdn.f128831k;
            }
            ByteString bxtx2 = bmdn3.f128836d;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bmgz bmgz2 = (bmgz) da3.f164949b;
            bxtx2.getClass();
            int i = 2 | bmgz2.f129373a;
            bmgz2.f129373a = i;
            bmgz2.f129375c = bxtx2;
            ByteString bxtx3 = bkan.f123833d.f129363f;
            bxtx3.getClass();
            bmgz2.f129373a = i | 4;
            bmgz2.f129376d = bxtx3;
            bmgz bmgz3 = (bmgz) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmgs bmgs = (bmgs) da2.f164949b;
            bmgz3.getClass();
            bmgs.f129322b = bmgz3;
            bmgs.f129321a = 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmft bmft2 = (bmft) da.f164949b;
            bmgs bmgs2 = (bmgs) da2.mo74062i();
            bmgs2.getClass();
            bmft2.f129165c = bmgs2;
            bmft2.f129164b = 1;
        } else if (fragment instanceof bkaq) {
            bxvd da4 = bmgs.f129319c.mo74144da();
            bkaq bkaq = (bkaq) fragment;
            bxvd da5 = bmhb.f129389f.mo74144da();
            bmdn bmdn4 = ((bmha) bkaq.f124069w).f129380b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            String str2 = bmdn4.f128834b;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bmhb bmhb = (bmhb) da5.f164949b;
            str2.getClass();
            bmhb.f129391a |= 1;
            bmhb.f129392b = str2;
            bmdn bmdn5 = ((bmha) bkaq.f124069w).f129380b;
            if (bmdn5 == null) {
                bmdn5 = bmdn.f128831k;
            }
            ByteString bxtx4 = bmdn5.f128836d;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bmhb bmhb2 = (bmhb) da5.f164949b;
            bxtx4.getClass();
            bmhb2.f129391a = 2 | bmhb2.f129391a;
            bmhb2.f129393c = bxtx4;
            int childCount = bkaq.f123845f.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                bmqk a = bkft.m105631a(bkaq.f123845f.getChildAt(i2), (bmqf) ((bmha) bkaq.f124069w).f129382d.get(i2));
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmhb bmhb3 = (bmhb) da5.f164949b;
                a.getClass();
                if (!bmhb3.f129395e.mo73666a()) {
                    bmhb3.f129395e = GeneratedMessageLite.m124021a(bmhb3.f129395e);
                }
                bmhb3.f129395e.add(a);
            }
            bmha bmha = (bmha) bkaq.f124069w;
            if ((bmha.f129379a & 8) != 0) {
                bmjf bmjf = bmha.f129385g;
                if (bmjf == null) {
                    bmjf = bmjf.f129685i;
                }
                String str3 = bmjf.f129693g;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmhb bmhb4 = (bmhb) da5.f164949b;
                str3.getClass();
                bmhb4.f129391a |= 4;
                bmhb4.f129394d = str3;
            }
            bmhb bmhb5 = (bmhb) da5.mo74062i();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bmgs bmgs3 = (bmgs) da4.f164949b;
            bmhb5.getClass();
            bmgs3.f129322b = bmhb5;
            bmgs3.f129321a = 3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmft bmft3 = (bmft) da.f164949b;
            bmgs bmgs4 = (bmgs) da4.mo74062i();
            bmgs4.getClass();
            bmft3.f129165c = bmgs4;
            bmft3.f129164b = 1;
        } else if (fragment instanceof bkiu) {
            bkiu bkiu = (bkiu) fragment;
            bxvd da6 = bmgw.f129350e.mo74144da();
            bmgv bmgv = (bmgv) bkiu.f124069w;
            if ((bmgv.f129341a & 1) != 0) {
                bmdn bmdn6 = bmgv.f129342b;
                if (bmdn6 == null) {
                    bmdn6 = bmdn.f128831k;
                }
                if ((bmdn6.f128833a & 1) != 0) {
                    bmdn bmdn7 = ((bmgv) bkiu.f124069w).f129342b;
                    if (bmdn7 == null) {
                        bmdn7 = bmdn.f128831k;
                    }
                    String str4 = bmdn7.f128834b;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bmgw bmgw = (bmgw) da6.f164949b;
                    str4.getClass();
                    bmgw.f129352a = 1 | bmgw.f129352a;
                    bmgw.f129353b = str4;
                }
                bmdn bmdn8 = ((bmgv) bkiu.f124069w).f129342b;
                if (bmdn8 == null) {
                    bmdn8 = bmdn.f128831k;
                }
                if ((bmdn8.f128833a & 4) != 0) {
                    bmdn bmdn9 = ((bmgv) bkiu.f124069w).f129342b;
                    if (bmdn9 == null) {
                        bmdn9 = bmdn.f128831k;
                    }
                    ByteString bxtx5 = bmdn9.f128836d;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bmgw bmgw2 = (bmgw) da6.f164949b;
                    bxtx5.getClass();
                    bmgw2.f129352a |= 2;
                    bmgw2.f129354c = bxtx5;
                }
            }
            if (bkiu.f124324c.getVisibility() == 0 && bkiu.f124324c.mo71871g() != null) {
                String g = bkiu.f124324c.mo71871g();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmgw bmgw3 = (bmgw) da6.f164949b;
                g.getClass();
                bmgw3.f129352a |= 4;
                bmgw3.f129355d = g;
            }
            bmgw bmgw4 = (bmgw) da6.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmft bmft4 = (bmft) da.f164949b;
            bmgw4.getClass();
            bmft4.f129165c = bmgw4;
            bmft4.f129164b = 2;
        } else if (fragment instanceof bkam) {
            bxvd da7 = bmgs.f129319c.mo74144da();
            bkam bkam = (bkam) fragment;
            bxvd da8 = bmgu.f129333e.mo74144da();
            bmdn bmdn10 = ((bmgt) bkam.f124069w).f129326b;
            if (bmdn10 == null) {
                bmdn10 = bmdn.f128831k;
            }
            ByteString bxtx6 = bmdn10.f128836d;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bmgu bmgu = (bmgu) da8.f164949b;
            bxtx6.getClass();
            bmgu.f129335a |= 2;
            bmgu.f129337c = bxtx6;
            bmdn bmdn11 = ((bmgt) bkam.f124069w).f129326b;
            if (bmdn11 == null) {
                bmdn11 = bmdn.f128831k;
            }
            String str5 = bmdn11.f128834b;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bmgu bmgu2 = (bmgu) da8.f164949b;
            str5.getClass();
            bmgu2.f129335a |= 1;
            bmgu2.f129336b = str5;
            bmgt bmgt = (bmgt) bkam.f124069w;
            if ((bmgt.f129325a & 8) != 0) {
                View view = bkam.f123821e;
                bmqf bmqf = bmgt.f129329e;
                if (bmqf == null) {
                    bmqf = bmqf.f130370r;
                }
                bmqk a2 = bkft.m105631a(view, bmqf);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bmgu bmgu3 = (bmgu) da8.f164949b;
                a2.getClass();
                bmgu3.f129338d = a2;
                bmgu3.f129335a |= 4;
            }
            bmgu bmgu4 = (bmgu) da8.mo74062i();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bmgs bmgs5 = (bmgs) da7.f164949b;
            bmgu4.getClass();
            bmgs5.f129322b = bmgu4;
            bmgs5.f129321a = 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmft bmft5 = (bmft) da.f164949b;
            bmgs bmgs6 = (bmgs) da7.mo74062i();
            bmgs6.getClass();
            bmft5.f129165c = bmgs6;
            bmft5.f129164b = 1;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Fragment=%s is not a valid instrument activation fragment", fragment));
        }
        return (bmft) da.mo74062i();
    }

    /* renamed from: a */
    public static bmfv m104698a(bmfu bmfu) {
        bmhj bmhj;
        bxvd bxvd;
        bmhl bmhl;
        bxvd bxvd2;
        bmhd bmhd;
        bmjc bmjc;
        bmkj bmkj;
        bmim bmim;
        bmia bmia;
        bmhz bmhz;
        String str;
        bmfu bmfu2 = bmfu;
        if (bmfu2 == null) {
            return null;
        }
        bxvd da = bmfv.f129179c.mo74144da();
        int i = bmfu2.f129169a;
        int i2 = 5;
        int i3 = 1;
        if ((i & 32) != 0) {
            bmhi bmhi = bmfu2.f129175g;
            if (bmhi == null) {
                bmhi = bmhi.f129409r;
            }
            if (bmhi != null) {
                if ((bmhi.f129411a & 2) != 0) {
                    bmhj bmhj2 = bmhi.f129413c;
                    if (bmhj2 == null) {
                        bmhj2 = bmhj.f129426h;
                    }
                    bxvd = (bxvd) bmhj2.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bmhj2);
                } else {
                    bxvd = bmhj.f129426h.mo74144da();
                }
                bmdn bmdn = bmhi.f129412b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                String str2 = bmdn.f128834b;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmhj bmhj3 = (bmhj) bxvd.f164949b;
                str2.getClass();
                bmhj3.f129428a |= 1;
                bmhj3.f129429b = str2;
                bmdn bmdn2 = bmhi.f129412b;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                ByteString bxtx = bmdn2.f128836d;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmhj bmhj4 = (bmhj) bxvd.f164949b;
                bxtx.getClass();
                bmhj4.f129428a |= 2;
                bmhj4.f129430c = bxtx;
                int size = bmhi.f129414d.size();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ((bmhj) bxvd.f164949b).f129432e = GeneratedMessageLite.m124030de();
                int i4 = 0;
                while (i4 < size) {
                    bmhk bmhk = (bmhk) bmhi.f129414d.get(i4);
                    if (bmhk != null) {
                        if ((bmhk.f129437a & 2) == 0) {
                            bxvd2 = bmhl.f129444f.mo74144da();
                        } else {
                            bmhl bmhl2 = bmhk.f129439c;
                            if (bmhl2 == null) {
                                bmhl2 = bmhl.f129444f;
                            }
                            bxvd bxvd3 = (bxvd) bmhl2.mo74142c(i2);
                            bxvd3.mo73625a((GeneratedMessageLite) bmhl2);
                            bxvd2 = bxvd3;
                        }
                        bmdn bmdn3 = bmhk.f129438b;
                        if (bmdn3 == null) {
                            bmdn3 = bmdn.f128831k;
                        }
                        if (!bmdn3.f128834b.isEmpty()) {
                            bmdn bmdn4 = bmhk.f129438b;
                            if (bmdn4 == null) {
                                bmdn4 = bmdn.f128831k;
                            }
                            String str3 = bmdn4.f128834b;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bmhl bmhl3 = (bmhl) bxvd2.f164949b;
                            str3.getClass();
                            bmhl3.f129446a |= i3;
                            bmhl3.f129447b = str3;
                        }
                        bmdn bmdn5 = bmhk.f129438b;
                        if (bmdn5 == null) {
                            bmdn5 = bmdn.f128831k;
                        }
                        if (!bmdn5.f128836d.mo73779j()) {
                            bmdn bmdn6 = bmhk.f129438b;
                            if (bmdn6 == null) {
                                bmdn6 = bmdn.f128831k;
                            }
                            ByteString bxtx2 = bmdn6.f128836d;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bmhl bmhl4 = (bmhl) bxvd2.f164949b;
                            bxtx2.getClass();
                            bmhl4.f129446a |= 2;
                            bmhl4.f129448c = bxtx2;
                        }
                        if ((bmhk.f129437a & 8) != 0) {
                            bmjf bmjf = bmhk.f129443g;
                            if (bmjf == null) {
                                bmjf = bmjf.f129685i;
                            }
                            String str4 = bmjf.f129693g;
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bmhl bmhl5 = (bmhl) bxvd2.f164949b;
                            str4.getClass();
                            bmhl5.f129446a |= 4;
                            bmhl5.f129450e = str4;
                        }
                        int size2 = bmhk.f129440d.size();
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        ((bmhl) bxvd2.f164949b).f129449d = GeneratedMessageLite.m124030de();
                        for (int i5 = 0; i5 < size2; i5++) {
                            bmhc bmhc = (bmhc) bmhk.f129440d.get(i5);
                            if (bmhc != null) {
                                bxvd da2 = bmhd.f129402c.mo74144da();
                                if (bmhc.f129398a == 2) {
                                    bmbs a = m104693a((bmbr) bmhc.f129399b);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bmhd bmhd2 = (bmhd) da2.f164949b;
                                    a.getClass();
                                    bmhd2.f129405b = a;
                                    bmhd2.f129404a = 2;
                                }
                                if (bmhc.f129398a == 4) {
                                    bmdt a2 = m104694a((bmds) bmhc.f129399b);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bmhd bmhd3 = (bmhd) da2.f164949b;
                                    a2.getClass();
                                    bmhd3.f129405b = a2;
                                    bmhd3.f129404a = 3;
                                }
                                if (bmhc.f129398a == 1) {
                                    bmqk a3 = m104699a((bmqf) bmhc.f129399b);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bmhd bmhd4 = (bmhd) da2.f164949b;
                                    a3.getClass();
                                    bmhd4.f129405b = a3;
                                    bmhd4.f129404a = 1;
                                }
                                bmhd = (bmhd) da2.mo74062i();
                            } else {
                                bmhd = null;
                            }
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bmhl bmhl6 = (bmhl) bxvd2.f164949b;
                            bmhd.getClass();
                            bmhl6.mo66793a();
                            bmhl6.f129449d.add(bmhd);
                        }
                        bmhl = (bmhl) bxvd2.mo74062i();
                    } else {
                        bmhl = null;
                    }
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmhj bmhj5 = (bmhj) bxvd.f164949b;
                    bmhl.getClass();
                    bmhj5.mo66791a();
                    bmhj5.f129432e.add(bmhl);
                    i4++;
                    i2 = 5;
                    i3 = 1;
                }
                bmhj = (bmhj) bxvd.mo74062i();
            } else {
                bmhj = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv = (bmfv) da.f164949b;
            bmhj.getClass();
            bmfv.f129182b = bmhj;
            bmfv.f129181a = 12;
        } else if ((i & 1) != 0) {
            bmhy bmhy = bmfu2.f129170b;
            if (bmhy == null) {
                bmhy = bmhy.f129503u;
            }
            if (bmhy != null) {
                if ((bmhy.f129505a & 16) == 0) {
                    bmhz = (bmhz) bmia.f129522m.mo74144da();
                } else {
                    bmia bmia2 = bmhy.f129512h;
                    if (bmia2 == null) {
                        bmia2 = bmia.f129522m;
                    }
                    bxvd bxvd4 = (bxvd) bmia2.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) bmia2);
                    bmhz = (bmhz) bxvd4;
                }
                bmdn bmdn7 = bmhy.f129506b;
                if (bmdn7 == null) {
                    bmdn7 = bmdn.f128831k;
                }
                if (!bmdn7.f128834b.isEmpty()) {
                    bmdn bmdn8 = bmhy.f129506b;
                    if (bmdn8 == null) {
                        bmdn8 = bmdn.f128831k;
                    }
                    String str5 = bmdn8.f128834b;
                    if (bmhz.f164950c) {
                        bmhz.mo74035c();
                        bmhz.f164950c = false;
                    }
                    bmia bmia3 = (bmia) bmhz.f164949b;
                    str5.getClass();
                    bmia3.f129524a |= 1;
                    bmia3.f129525b = str5;
                }
                if ((bmhy.f129505a & 8) != 0) {
                    bmbr bmbr = bmhy.f129511g;
                    if (bmbr == null) {
                        bmbr = bmbr.f128572L;
                    }
                    bmbs a4 = m104693a(bmbr);
                    if (bmhz.f164950c) {
                        bmhz.mo74035c();
                        bmhz.f164950c = false;
                    }
                    bmia bmia4 = (bmia) bmhz.f164949b;
                    a4.getClass();
                    bmia4.f129531h = a4;
                    bmia4.f129524a |= 64;
                }
                if ((bmhy.f129505a & 32) != 0) {
                    bmia bmia5 = (bmia) bmhz.f164949b;
                    if ((bmia5.f129524a & 64) != 0) {
                        bmbs bmbs = bmia5.f129531h;
                        if (bmbs == null) {
                            bmbs = bmbs.f128609j;
                        }
                        btwp btwp = bmbs.f128615e;
                        if (btwp == null) {
                            btwp = btwp.f152728s;
                        }
                        str = btwp.f152731b;
                    } else {
                        str = null;
                    }
                    bmjh bmjh = bmhy.f129513i;
                    if (bmjh == null) {
                        bmjh = bmjh.f129700e;
                    }
                    String a5 = m104700a(bmjh, str);
                    if (bmhz.f164950c) {
                        bmhz.mo74035c();
                        bmhz.f164950c = false;
                    }
                    bmia bmia6 = (bmia) bmhz.f164949b;
                    a5.getClass();
                    bmia6.f129524a |= 512;
                    bmia6.f129535l = a5;
                }
                bmia = (bmia) bmhz.mo74062i();
            } else {
                bmia = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv2 = (bmfv) da.f164949b;
            bmia.getClass();
            bmfv2.f129182b = bmia;
            bmfv2.f129181a = 1;
        } else if ((i & 2) != 0) {
            bmil bmil = bmfu2.f129171c;
            if (bmil == null) {
                bmil = bmil.f129588g;
            }
            if (bmil != null) {
                bxvd da3 = bmim.f129596f.mo74144da();
                bmdn bmdn9 = bmil.f129591b;
                if (bmdn9 == null) {
                    bmdn9 = bmdn.f128831k;
                }
                String str6 = bmdn9.f128834b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bmim bmim2 = (bmim) da3.f164949b;
                str6.getClass();
                bmim2.f129598a |= 1;
                bmim2.f129599b = str6;
                bmdn bmdn10 = bmil.f129591b;
                if (bmdn10 == null) {
                    bmdn10 = bmdn.f128831k;
                }
                ByteString bxtx3 = bmdn10.f128836d;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bmim bmim3 = (bmim) da3.f164949b;
                bxtx3.getClass();
                bmim3.f129598a |= 2;
                bmim3.f129600c = bxtx3;
                if ((bmil.f129590a & 512) != 0) {
                    bmjf bmjf2 = bmil.f129595f;
                    if (bmjf2 == null) {
                        bmjf2 = bmjf.f129685i;
                    }
                    String str7 = bmjf2.f129693g;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmim bmim4 = (bmim) da3.f164949b;
                    str7.getClass();
                    bmim4.f129598a |= 4;
                    bmim4.f129601d = str7;
                }
                bmim = (bmim) da3.mo74062i();
            } else {
                bmim = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv3 = (bmfv) da.f164949b;
            bmim.getClass();
            bmfv3.f129182b = bmim;
            bmfv3.f129181a = 4;
        } else if ((i & 64) != 0) {
            bmki bmki = bmfu2.f129176h;
            if (bmki == null) {
                bmki = bmki.f129802w;
            }
            if (bmki != null) {
                bxvd da4 = bmkj.f129827l.mo74144da();
                bmdn bmdn11 = bmki.f129805b;
                if (bmdn11 == null) {
                    bmdn11 = bmdn.f128831k;
                }
                if ((bmdn11.f128833a & 1) != 0) {
                    bmdn bmdn12 = bmki.f129805b;
                    if (bmdn12 == null) {
                        bmdn12 = bmdn.f128831k;
                    }
                    String str8 = bmdn12.f128834b;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bmkj bmkj2 = (bmkj) da4.f164949b;
                    str8.getClass();
                    bmkj2.f129829a |= 1;
                    bmkj2.f129832d = str8;
                }
                bmdn bmdn13 = bmki.f129805b;
                if (bmdn13 == null) {
                    bmdn13 = bmdn.f128831k;
                }
                if ((bmdn13.f128833a & 4) != 0) {
                    bmdn bmdn14 = bmki.f129805b;
                    if (bmdn14 == null) {
                        bmdn14 = bmdn.f128831k;
                    }
                    ByteString bxtx4 = bmdn14.f128836d;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bmkj bmkj3 = (bmkj) da4.f164949b;
                    bxtx4.getClass();
                    bmkj3.f129829a |= 2;
                    bmkj3.f129833e = bxtx4;
                }
                bmkj = (bmkj) da4.mo74062i();
            } else {
                bmkj = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv4 = (bmfv) da.f164949b;
            bmkj.getClass();
            bmfv4.f129182b = bmkj;
            bmfv4.f129181a = 13;
        } else if ((i & 8) != 0) {
            bmeb bmeb = bmfu2.f129173e;
            if (bmeb == null) {
                bmeb = bmeb.f128902g;
            }
            bmed a6 = m104696a(bmeb);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv5 = (bmfv) da.f164949b;
            a6.getClass();
            bmfv5.f129182b = a6;
            bmfv5.f129181a = 11;
        } else if ((i & 4) != 0) {
            bmjb bmjb = bmfu2.f129172d;
            if (bmjb == null) {
                bmjb = bmjb.f129661l;
            }
            if (bmjb != null) {
                bxvd da5 = bmjc.f129674i.mo74144da();
                int a7 = bmja.m108079a(bmjb.f129665c);
                if (a7 == 0) {
                    a7 = 1;
                }
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bmjc bmjc2 = (bmjc) da5.f164949b;
                bmjc2.f129681f = a7 - 1;
                bmjc2.f129676a |= 8;
                bmqf bmqf = bmjb.f129668f;
                if (bmqf == null) {
                    bmqf = bmqf.f130370r;
                }
                bmqk a8 = m104699a(bmqf);
                if (a8 != null) {
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bmjc bmjc3 = (bmjc) da5.f164949b;
                    a8.getClass();
                    bmjc3.f129677b = a8;
                    bmjc3.f129676a |= 1;
                }
                bmqf bmqf2 = bmjb.f129669g;
                if (bmqf2 == null) {
                    bmqf2 = bmqf.f130370r;
                }
                bmqk a9 = m104699a(bmqf2);
                if (a9 != null) {
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bmjc bmjc4 = (bmjc) da5.f164949b;
                    a9.getClass();
                    bmjc4.f129678c = a9;
                    bmjc4.f129676a |= 2;
                }
                if ((bmjb.f129663a & 128) != 0) {
                    bmjf bmjf3 = bmjb.f129671i;
                    if (bmjf3 == null) {
                        bmjf3 = bmjf.f129685i;
                    }
                    String str9 = bmjf3.f129693g;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bmjc bmjc5 = (bmjc) da5.f164949b;
                    str9.getClass();
                    bmjc5.f129676a |= 16;
                    bmjc5.f129682g = str9;
                }
                bmjc = (bmjc) da5.mo74062i();
            } else {
                bmjc = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfv bmfv6 = (bmfv) da.f164949b;
            bmjc.getClass();
            bmfv6.f129182b = bmjc;
            bmfv6.f129181a = 6;
        }
        return (bmfv) da.mo74062i();
    }

    /* renamed from: a */
    public static bmqk m104699a(bmqf bmqf) {
        bmqe bmqe;
        String str;
        bmpl bmpl;
        bmqe bmqe2;
        bmqe bmqe3;
        bmqe bmqe4;
        bmpe bmpe;
        bmpe bmpe2;
        bmpe bmpe3;
        if (bmqf == null) {
            return null;
        }
        bxvd da = bmqk.f130403g.mo74144da();
        int i = 1;
        if ((bmqf.f130372a & 1) != 0 && !bmqf.f130375d.isEmpty()) {
            String str2 = bmqf.f130375d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk = (bmqk) da.f164949b;
            str2.getClass();
            bmqk.f130405a |= 1;
            bmqk.f130408d = str2;
        }
        if ((bmqf.f130372a & 512) != 0 && bmqf.f130385n.mo73744a() > 0) {
            ByteString bxtx = bmqf.f130385n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk2 = (bmqk) da.f164949b;
            bxtx.getClass();
            bmqk2.f130405a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bmqk2.f130410f = bxtx;
        }
        int i2 = bmqf.f130373b;
        if (i2 == 16) {
            bmpe bmpe4 = (bmpe) bmqf.f130374c;
            if ((bmpe4.f130281a & 8) != 0) {
                blxc blxc = bmpe4.f130285e;
                if (blxc == null) {
                    blxc = blxc.f128037e;
                }
                if (!bmqf.f130377f) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmqk bmqk3 = (bmqk) da.f164949b;
                    blxc.getClass();
                    bmqk3.f130407c = blxc;
                    bmqk3.f130406b = 7;
                } else {
                    if (bmqf.f130373b == 16) {
                        bmpe = (bmpe) bmqf.f130374c;
                    } else {
                        bmpe = bmpe.f130279k;
                    }
                    int a = bmpd.m108249a(bmpe.f130282b);
                    if (a != 0 && a == 3) {
                        String format = String.format(Locale.US, "%02d/%04d", Integer.valueOf(blxc.f128041c), Integer.valueOf(blxc.f128040b));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmqk bmqk4 = (bmqk) da.f164949b;
                        format.getClass();
                        bmqk4.f130406b = 8;
                        bmqk4.f130407c = format;
                    } else {
                        if (bmqf.f130373b == 16) {
                            bmpe2 = (bmpe) bmqf.f130374c;
                        } else {
                            bmpe2 = bmpe.f130279k;
                        }
                        int a2 = bmpd.m108249a(bmpe2.f130282b);
                        if (a2 != 0 && a2 == 2) {
                            String format2 = String.format(Locale.US, "%02d/%02d/%04d", Integer.valueOf(blxc.f128041c), Integer.valueOf(blxc.f128042d), Integer.valueOf(blxc.f128040b));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmqk bmqk5 = (bmqk) da.f164949b;
                            format2.getClass();
                            bmqk5.f130406b = 8;
                            bmqk5.f130407c = format2;
                        } else {
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[1];
                            if (bmqf.f130373b == 16) {
                                bmpe3 = (bmpe) bmqf.f130374c;
                            } else {
                                bmpe3 = bmpe.f130279k;
                            }
                            int a3 = bmpd.m108249a(bmpe3.f130282b);
                            if (a3 != 0) {
                                i = a3;
                            }
                            objArr[0] = Integer.valueOf(i - 1);
                            throw new IllegalArgumentException(String.format(locale, "DateField.Type %s not supported.", objArr));
                        }
                    }
                }
            }
        } else if (i2 != 10) {
            if (i2 == 6) {
                bmqe = (bmqe) bmqf.f130374c;
            } else {
                bmqe = bmqe.f130351s;
            }
            if ((bmqe.f130353a & 16) != 0) {
                if (bmqf.f130373b == 6) {
                    bmqe2 = (bmqe) bmqf.f130374c;
                } else {
                    bmqe2 = bmqe.f130351s;
                }
                if (!bmqe2.f130362k.isEmpty()) {
                    if (bmqf.f130377f) {
                        if (bmqf.f130373b == 6) {
                            bmqe4 = (bmqe) bmqf.f130374c;
                        } else {
                            bmqe4 = bmqe.f130351s;
                        }
                        String str3 = bmqe4.f130362k;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmqk bmqk6 = (bmqk) da.f164949b;
                        str3.getClass();
                        bmqk6.f130406b = 8;
                        bmqk6.f130407c = str3;
                    } else {
                        if (bmqf.f130373b == 6) {
                            bmqe3 = (bmqe) bmqf.f130374c;
                        } else {
                            bmqe3 = bmqe.f130351s;
                        }
                        String str4 = bmqe3.f130362k;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmqk bmqk7 = (bmqk) da.f164949b;
                        str4.getClass();
                        bmqk7.f130406b = 2;
                        bmqk7.f130407c = str4;
                    }
                }
            }
            if (bmqf.f130373b == 7) {
                int a4 = bkft.m105627a((bmpl) bmqf.f130374c);
                if (a4 < 0) {
                    str = "";
                } else {
                    if (bmqf.f130373b == 7) {
                        bmpl = (bmpl) bmqf.f130374c;
                    } else {
                        bmpl = bmpl.f130314g;
                    }
                    str = ((bmpk) bmpl.f130317b.get(a4)).f130306g;
                }
                if (bmqf.f130377f) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmqk bmqk8 = (bmqk) da.f164949b;
                    str.getClass();
                    bmqk8.f130406b = 8;
                    bmqk8.f130407c = str;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmqk bmqk9 = (bmqk) da.f164949b;
                    str.getClass();
                    bmqk9.f130406b = 2;
                    bmqk9.f130407c = str;
                }
            }
        } else if (bmqf.f130377f) {
            bmqh a5 = bmqh.m108281a(((bmow) bmqf.f130374c).f130268c);
            if (a5 == null) {
                a5 = bmqh.UNKNOWN;
            }
            String num = Integer.toString(a5.f130395e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk10 = (bmqk) da.f164949b;
            num.getClass();
            bmqk10.f130406b = 8;
            bmqk10.f130407c = num;
        } else {
            bmqh a6 = bmqh.m108281a(((bmow) bmqf.f130374c).f130268c);
            if (a6 == null) {
                a6 = bmqh.UNKNOWN;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmqk bmqk11 = (bmqk) da.f164949b;
            bmqk11.f130407c = Integer.valueOf(a6.f130395e);
            bmqk11.f130406b = 5;
        }
        return (bmqk) da.mo74062i();
    }

    /* renamed from: a */
    public static String m104700a(bmjh bmjh, String str) {
        if (bmjh == null) {
            return "";
        }
        if (!TextUtils.isEmpty(str) && bmjh.f129704c.size() > 0) {
            bxwc bxwc = bmjh.f129704c;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bmjg bmjg = (bmjg) bxwc.get(i);
                if (bmjg != null && str.equalsIgnoreCase(bmjg.f129697a)) {
                    bmjf bmjf = bmjg.f129698b;
                    if (bmjf == null) {
                        bmjf = bmjf.f129685i;
                    }
                    return bmjf.f129693g;
                }
            }
        }
        if ((bmjh.f129702a & 1) == 0) {
            return null;
        }
        bmjf bmjf2 = bmjh.f129703b;
        if (bmjf2 == null) {
            bmjf2 = bmjf.f129685i;
        }
        return bmjf2.f129693g;
    }

    /* renamed from: a */
    public static void m104701a(bkdw bkdw, bkeo bkeo, boolean z) {
        m104702a(bkdw, bkeo, z, new HashSet());
    }

    /* renamed from: a */
    static void m104702a(bkdw bkdw, bkeo bkeo, boolean z, HashSet hashSet) {
        String str;
        if (bkdw != null && !bkeo.mo65911a()) {
            if (!(bkdw instanceof bkdx) && !z) {
                bkdw = null;
            } else {
                while (bkdw != null && !(bkdw instanceof bkdg)) {
                    bkdw = bkdw.mo52821U();
                }
            }
            if (bkdw != null && !hashSet.contains(bkdw)) {
                hashSet.add(bkdw);
                ArrayList bW = ((bkdg) bkdw).mo52778bW();
                int size = bW.size();
                for (int i = 0; i < size && !bkeo.mo65911a(); i++) {
                    Object obj = ((bkde) bW.get(i)).f124039e;
                    long j = ((bkde) bW.get(i)).f124038d;
                    if (bkeo.mo65912a(j)) {
                        if (!bkeo.f124095a.f130186c) {
                            str = bkft.m105634a(obj);
                        } else if (obj instanceof View) {
                            View b = bkft.m105641b((View) obj);
                            if (b instanceof FormEditText) {
                                str = ((FormEditText) b).mo71937m();
                            } else if (b instanceof FormSpinner) {
                                str = ((FormSpinner) b).mo71973c();
                            } else if (b instanceof InlineSelectView) {
                                str = ((InlineSelectView) b).mo72020c();
                            } else {
                                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %s", b));
                            }
                        } else {
                            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %s", obj));
                        }
                        bkeo.mo65910a(j, str);
                    }
                    if ((obj instanceof bkdx) && !hashSet.contains(obj)) {
                        m104702a((bkdw) obj, bkeo, false, hashSet);
                    }
                }
                if (!bkeo.mo65911a() && z) {
                    m104702a(bkdw.mo52821U(), bkeo, true, hashSet);
                }
            }
        }
    }
}
