package io.shipright.teamcity.server;


import com.intellij.openapi.diagnostic.Logger;

import jetbrains.buildServer.Build;
import jetbrains.buildServer.notification.Notificator;
import jetbrains.buildServer.responsibility.ResponsibilityEntry;
import jetbrains.buildServer.responsibility.TestNameResponsibilityEntry;
import jetbrains.buildServer.serverSide.SBuildType;
import jetbrains.buildServer.serverSide.SProject;
import jetbrains.buildServer.serverSide.SRunningBuild;
import jetbrains.buildServer.serverSide.STest;
import jetbrains.buildServer.serverSide.mute.MuteInfo;
import jetbrains.buildServer.serverSide.problems.BuildProblemInfo;
import jetbrains.buildServer.tests.TestName;
import jetbrains.buildServer.users.SUser;
import jetbrains.buildServer.vcs.VcsRoot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Set;

public class AdmiralNotifier implements Notificator {
    private static final Logger LOG = Logger.getInstance(AdmiralNotifier.class.getName());

    @Override
    public void notifyBuildStarted(@NotNull SRunningBuild runningBuild, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildStarted");
    }

    @Override
    public void notifyBuildSuccessful(@NotNull SRunningBuild runningBuild, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildSuccessful");
    }

    @Override
    public void notifyBuildFailed(@NotNull SRunningBuild runningBuild, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildFailed");
    }

    @Override
    public void notifyBuildFailedToStart(@NotNull SRunningBuild runningBuild, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildFailedToStart");
    }

    @Override
    public void notifyLabelingFailed(@NotNull Build build, @NotNull VcsRoot vcsRoot, @NotNull Throwable throwable, @NotNull Set<SUser> users) {
        LOG.debug("notifyLabelingFailed");
    }

    @Override
    public void notifyBuildFailing(@NotNull SRunningBuild runningBuild, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildFailing");
    }

    @Override
    public void notifyBuildProbablyHanging(@NotNull SRunningBuild runningBuild, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildProbablyHanging");
    }

    @Override
    public void notifyResponsibleChanged(@NotNull SBuildType buildType, @NotNull Set<SUser> users) {
        LOG.debug("notifyResponsibleChanged");
    }

    @Override
    public void notifyResponsibleAssigned(@NotNull SBuildType buildType, @NotNull Set<SUser> users) {
        LOG.debug("notifyResponsibleAssigned");
    }

    @Override
    public void notifyResponsibleChanged(@Nullable TestNameResponsibilityEntry testNameResponsibilityEntry, @NotNull TestNameResponsibilityEntry testNameResponsibilityEntry1, @NotNull SProject project, @NotNull Set<SUser> users) {
        LOG.debug("notifyResponsibleChanged");
    }

    @Override
    public void notifyResponsibleAssigned(@Nullable TestNameResponsibilityEntry testNameResponsibilityEntry, @NotNull TestNameResponsibilityEntry testNameResponsibilityEntry1, @NotNull SProject project, @NotNull Set<SUser> users) {
        LOG.debug("notifyResponsibleAssigned");
    }

    @Override
    public void notifyResponsibleChanged(@NotNull Collection<TestName> testNames, @NotNull ResponsibilityEntry responsibilityEntry, @NotNull SProject project, @NotNull Set<SUser> users) {
        LOG.debug("notifyResponsibleChanged");
    }

    @Override
    public void notifyResponsibleAssigned(@NotNull Collection<TestName> testNames, @NotNull ResponsibilityEntry responsibilityEntry, @NotNull SProject project, @NotNull Set<SUser> users) {
        LOG.debug("notifyResponsibleAssigned");
    }

    @Override
    public void notifyBuildProblemResponsibleAssigned(@NotNull Collection<BuildProblemInfo> buildProblemInfos, @NotNull ResponsibilityEntry responsibilityEntry, @NotNull SProject project, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildProblemResponsibleAssigned");
    }

    @Override
    public void notifyBuildProblemResponsibleChanged(@NotNull Collection<BuildProblemInfo> buildProblemInfos, @NotNull ResponsibilityEntry responsibilityEntry, @NotNull SProject project, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildProblemResponsibleChanged");
    }

    @Override
    public void notifyTestsMuted(@NotNull Collection<STest> tests, @NotNull MuteInfo muteInfo, @NotNull Set<SUser> users) {
        LOG.debug("notifyTestsMuted");
    }

    @Override
    public void notifyTestsUnmuted(@NotNull Collection<STest> tests, @NotNull MuteInfo muteInfo, @Nullable SUser user, @NotNull Set<SUser> users) {
        LOG.debug("notifyTestsUnmuted");
    }

    @Override
    public void notifyBuildProblemsMuted(@NotNull Collection<BuildProblemInfo> buildProblemInfos, @NotNull MuteInfo muteInfo, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildProblemsMuted");
    }

    @Override
    public void notifyBuildProblemsUnmuted(@NotNull Collection<BuildProblemInfo> buildProblemInfos, @NotNull MuteInfo muteInfo, @Nullable SUser user, @NotNull Set<SUser> users) {
        LOG.debug("notifyBuildProblemsUnmuted");
    }

    @NotNull
    @Override
    public String getNotificatorType() {
        return "tcAdmiralNotifier";
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Admiral Notifier";
    }

    private void doNotifications(String message, Set<SUser> users, int notificationLevel) {

    }
}